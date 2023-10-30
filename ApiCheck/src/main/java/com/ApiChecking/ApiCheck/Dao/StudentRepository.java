package com.ApiChecking.ApiCheck.Dao;

import com.ApiChecking.ApiCheck.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
