package com.ApiChecking.ApiCheck.services;

import com.ApiChecking.ApiCheck.Dao.StudentRepository;
import com.ApiChecking.ApiCheck.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)   this is used for when we want the bean will create once and the same bean shared among all when others required and it is bidefault
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  this is used when we want to create multiple beans of this class
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public Student getSingleStudent(Long id) {
        return this.studentRepository.findById(id).get();
    }
}
