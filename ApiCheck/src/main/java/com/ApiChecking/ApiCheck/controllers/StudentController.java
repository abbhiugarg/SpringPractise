package com.ApiChecking.ApiCheck.controllers;

import com.ApiChecking.ApiCheck.entities.Student;
import com.ApiChecking.ApiCheck.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students/")
public class StudentController {

//    @Autowired
    private StudentService studentService;

    @Autowired
    public StudentController(/*@Qualifier("studentServiceImpl")*/ StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/working")
    public List<Student> getStudents(){
        return this.studentService.getAllStudents();
    }

    @GetMapping("/working/{id}")
    public Student getStudentById(@PathVariable Long id){
        return this.studentService.getSingleStudent(id);
    }
}
