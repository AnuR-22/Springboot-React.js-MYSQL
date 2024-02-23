package com.cms.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.springbootbackend.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // all crud database methods
}
