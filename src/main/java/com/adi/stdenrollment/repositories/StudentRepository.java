package com.adi.stdenrollment.repositories;

import com.adi.stdenrollment.entities.student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<student, Integer> {

}
