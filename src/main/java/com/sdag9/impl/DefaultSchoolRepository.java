package com.sdag9.impl;

import com.sdag9.model.School;
import com.sdag9.repositories.SchoolRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultSchoolRepository extends DefRepositoryImpl<School> implements SchoolRepository {

}
