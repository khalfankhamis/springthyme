package com.mavipsBoot.MavipCrud.repository;

import com.mavipsBoot.MavipCrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
