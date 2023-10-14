package com.project.ProjectAlt96.model.dao;

import com.project.ProjectAlt96.model.Dao;
import com.project.ProjectAlt96.model.pojo.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public class UsersDao implements Dao<Users> {
    private static final Logger logger = LogManager.getLogger(Users.class);
    @Autowired
    private EntityManager entityManager;
    @Transactional
    @Override
    public void save(Users entity) {
        entityManager.persist(entity);
    }

    @Transactional
    @Override
    public void update(Users entity) {
        entityManager.merge(entity);
    }

    @Transactional
    @Override
    public void delete(Users entity) {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }

    @Transactional
    @Override
    public void refresh(Users entity)  {entityManager.refresh(entity);}

    @Override
    public Optional<Users> getById(int id) {
        return Optional.ofNullable(entityManager.find(Users.class, id));
    }

    @Override
    public Users getLast() {
        TypedQuery<Users> query = entityManager.createQuery("FROM Users u ORDER BY u.id DESC", Users.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }

    @Override
    public List<Users> getAll() {
        TypedQuery<Users> query = entityManager.createQuery("FROM Users", Users.class);
        return query.getResultList();
    }

    public Users getByUsername(String username) {
        TypedQuery<Users> query = entityManager.createQuery("FROM Users u WHERE username = :username", Users.class);
        query.setParameter("username", username);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
