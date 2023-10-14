package com.project.ProjectAlt96.model.dao;

import com.project.ProjectAlt96.model.Dao;

import com.project.ProjectAlt96.model.pojo.Macroarea;
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
public class MacroareaDao implements Dao<Macroarea> {
    private static final Logger logger = LogManager.getLogger(MacroareaDao.class);
    @Autowired
    private EntityManager entityManager;

    @Transactional
    @Override
    public void save(Macroarea entity) {
        entityManager.persist(entity);
    }

    @Transactional
    @Override
    public void update(Macroarea entity) {
        entityManager.merge(entity);
    }

    @Transactional
    @Override
    public void delete(Macroarea entity) {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }

    @Transactional
    @Override
    public void refresh(Macroarea entity)  {entityManager.refresh(entity);}

    @Override
    public Optional<Macroarea> getById(int id) {
        return Optional.ofNullable(entityManager.find(Macroarea.class, id));
    }

    @Override
    public Macroarea getLast() {
        TypedQuery<Macroarea> query = entityManager.createQuery("FROM Macroarea m JOIN FETCH m.user ORDER BY m.id DESC", Macroarea.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }

    @Override
    public List<Macroarea> getAll() {
        TypedQuery<Macroarea> query = entityManager.createQuery("FROM Macroarea", Macroarea.class);
        return query.getResultList();
    }

    public List<Macroarea> getAllbyUser(Users user) {
        TypedQuery<Macroarea> query = entityManager.createQuery("FROM Macroarea WHERE user=:user ", Macroarea.class);
        query.setParameter("user",user);
        return query.getResultList();
    }
}
