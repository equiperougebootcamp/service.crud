package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Produit;
import com.bootcamp.repositories.ProduitRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class ProduitCRUD implements DatabaseConstants {
    public static boolean create(Produit produit) throws SQLException {
        ProduitRepository produitRepository = new ProduitRepository(PERSISTENCE_UNIT);
        return produitRepository.create(produit);
    }

    public static boolean update(Produit produit) throws SQLException {
        ProduitRepository produitRepository = new ProduitRepository(PERSISTENCE_UNIT);
        return produitRepository.update(produit);
    }


    public static boolean delete(Produit produit) throws SQLException {
        ProduitRepository produitRepository = new ProduitRepository(PERSISTENCE_UNIT);
        return  produitRepository.delete(produit);

    }

    public static List<Produit> read(Criterias criterias) {
        ProduitRepository produitRepository = new ProduitRepository(PERSISTENCE_UNIT);
        return produitRepository.getDataByCriteria(criterias);
    }

    public static List<Produit> read(Criterias criterias, int page, int size) {
        ProduitRepository produitRepository = new ProduitRepository(PERSISTENCE_UNIT);
        return produitRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Produit> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ProduitRepository produitRepository = new ProduitRepository(PERSISTENCE_UNIT);
        return produitRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Produit> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ProduitRepository produitRepository = new ProduitRepository(PERSISTENCE_UNIT);
        return produitRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Produit> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        ProduitRepository produitRepository = new ProduitRepository(PERSISTENCE_UNIT);
        return produitRepository.getDataByCriteria(fields);
    }

    public static List<Produit> read() throws SQLException {
        ProduitRepository produitRepository = new ProduitRepository(PERSISTENCE_UNIT);
        return produitRepository.findAll();
    }
}
