package com.example.project1.project1.services;


import com.example.project1.project1.entities.Student;
import com.example.project1.project1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> listStudents(){
        return repository.findAll();
    };

    @Override
    public Student saveStudent(Student student){
        return repository.save(student);
    }

    @Override
    public Student selectStudentId(Long id){
        return repository.findById(id).get();
    }

    @Override
    public Student upgradeStudent(Student student){
        return repository.save(student);
    }

    @Override
    public void deleteStudent(Long id){
        repository.deleteById(id);
    }
}
