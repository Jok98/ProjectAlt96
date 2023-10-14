package com.project.ProjectAlt96.model.dao;

import com.project.ProjectAlt96.model.Dao;
import com.project.ProjectAlt96.model.pojo.Expenses;
import com.project.ProjectAlt96.model.pojo.Macroarea;
import com.project.ProjectAlt96.model.pojo.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;


@Repository
public class ExpensesDao implements Dao<Expenses> {
    private static final Logger logger = LogManager.getLogger(ExpensesDao.class);
    @Autowired
    private EntityManager entityManager;
    @Transactional
    @Override
    public void save(Expenses entity) {
        entityManager.persist(entity);
    }

    @Transactional
    @Override
    public void update(Expenses entity) {
        entityManager.merge(entity);
    }

    @Transactional
    @Override
    public void delete(Expenses entity) {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }

    @Transactional
    @Override
    public void refresh(Expenses entity)  {entityManager.refresh(entity);}

    @Override
    public Optional<Expenses> getById(int id) {
        return Optional.ofNullable(entityManager.find(Expenses.class, id));
    }

    @Override
    public Expenses getLast() {
        TypedQuery<Expenses> query = entityManager.createQuery("FROM Expenses e JOIN FETCH e.macroarea JOIN FETCH e.user ORDER BY e.id DESC", Expenses.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }

    @Override
    public List<Expenses> getAll() {
        TypedQuery<Expenses> query = entityManager.createQuery("FROM Expenses", Expenses.class);
        return query.getResultList();
    }

    public List<Expenses> getAllbyUser(Users user) {
        TypedQuery<Expenses> query = entityManager.createQuery("FROM Expenses WHERE user=:user ", Expenses.class);
        query.setParameter("user",user);
        return query.getResultList();
    }
}
