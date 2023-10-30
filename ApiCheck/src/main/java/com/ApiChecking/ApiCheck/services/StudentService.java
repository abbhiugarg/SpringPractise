package com.ApiChecking.ApiCheck.services;

import com.ApiChecking.ApiCheck.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getSingleStudent(Long id);

}
