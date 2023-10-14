package com.project.ProjectAlt96.model;

import com.project.ProjectAlt96.model.pojo.Expenses;
import com.project.ProjectAlt96.model.pojo.Users;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    void save(T entity);

    void update(T entity);

    void delete(T entity);

    void refresh(T entity);

    Optional<T> getById(int id);

    T getLast();

    List<T> getAll();

}

