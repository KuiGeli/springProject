package com.sdag9.repositories;

import com.sdag9.model.School;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends CrudRepository<School, Long> {

//    List<School> findAllByAddress(String address, String name);
}
