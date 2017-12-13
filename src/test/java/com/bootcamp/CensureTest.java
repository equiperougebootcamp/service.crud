package com.bootcamp;

import com.bootcamp.commons.utils.GsonUtils;
import org.testng.annotations.Test;
import com.bootcamp.entities.Censure;
import java.sql.SQLException;


/**
 * Created by darextossa on 9/22/17.
 */


public class CensureTest {

    @Test
    public void createCensure() throws SQLException{
        Censure censure = new Censure();
        censure.setMessage("Ce post n'a pas sa place ici");
        censure.setEntityId(1);
        censure.setEntityType("COMMENTAIRE");
        censure.setDateCreation(System.currentTimeMillis());
        censure.setDateMiseAJour(System.currentTimeMillis());
        CensureCRUD.create(censure);
        System.out.println(GsonUtils.toJSONWithoutClassName(censure));
    }
}
