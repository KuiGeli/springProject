package com.sdag9.impl;

import com.sdag9.model.DefaultModel;
import com.sdag9.repositories.DefaultRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public abstract class DefRepositoryImpl<T  extends DefaultModel> implements DefaultRepository<T> {

    List<T> entityList = new ArrayList<>();

    @Override
    public T findById(int id) {
        return entityList.stream().filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<T> findByName(String name) {
        return entityList.stream().filter(school -> school.getName() == name)
                .collect(Collectors.toList());
    }

    @Override
    public void create(T object) {
        entityList.add(object);
    }

    @Override
    public void delete(T object) {
        entityList.remove(object);
    }

    @Override
    public void update(T object) {
        delete(object);
        entityList.add(object);
    }
}
