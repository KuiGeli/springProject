package com.sdag9.repositories;

import com.sdag9.model.DefaultModel;

import java.util.List;


@org.springframework.stereotype.Repository
public interface DefaultRepository<T extends DefaultModel> {

    T findById(int id);

    List<T> findByName(String name);

    void create(T object);

    void delete(T object);

    void update(T object);

}
