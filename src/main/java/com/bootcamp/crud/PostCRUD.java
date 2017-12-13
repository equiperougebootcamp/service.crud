package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Post;
import com.bootcamp.entities.Produit;
import com.bootcamp.repositories.PostRepository;
import com.bootcamp.repositories.ProduitRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class PostCRUD implements DatabaseConstants {
    public static boolean create(Post post) throws SQLException {
        PostRepository postRepository = new PostRepository(PERSISTENCE_UNIT);
        return postRepository.create(post);
    }

    public static boolean update(Post post) throws SQLException {
        PostRepository postRepository = new PostRepository(PERSISTENCE_UNIT);
        return postRepository.update(post);
    }


    public static boolean delete(Post post) throws SQLException {
        PostRepository postRepository = new PostRepository(PERSISTENCE_UNIT);
        return  postRepository.delete(post);

    }

    public static List<Post> read(Criterias criterias) {
        PostRepository postRepository = new PostRepository(PERSISTENCE_UNIT);
        return postRepository.getDataByCriteria(criterias);
    }

    public static List<Post> read(Criterias criterias, int page, int size) {
        PostRepository postRepository = new PostRepository(PERSISTENCE_UNIT);
        return postRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Post> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PostRepository postRepository = new PostRepository(PERSISTENCE_UNIT);
        return postRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Post> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PostRepository postRepository = new PostRepository(PERSISTENCE_UNIT);
        return postRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Post> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        PostRepository postRepository = new PostRepository(PERSISTENCE_UNIT);
        return postRepository.getDataByCriteria(fields);
    }

    public static List<Post> read() throws SQLException {
        PostRepository postRepository = new PostRepository(PERSISTENCE_UNIT);
        return postRepository.findAll();
    }
}
