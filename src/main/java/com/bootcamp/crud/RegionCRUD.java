
package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Region;
import com.bootcamp.repositories.RegionRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author groupe rouge
 */
public class RegionCRUD implements DatabaseConstants{
    public static boolean create(Region region) throws SQLException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.create(region);
    }

    public static boolean update(Region region) throws SQLException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.update(region);
    }


    public static boolean delete(Region region) throws SQLException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return  regionRepository.delete(region);

    }

    public static List<Region> read(Criterias criterias) {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.getDataByCriteria(criterias);
    }

    public static List<Region> read(Criterias criterias, int page, int size) {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Region> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Region> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Region> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.getDataByCriteria(fields);
    }

    public static List<Region> read() throws SQLException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.findAll();
    }
}
