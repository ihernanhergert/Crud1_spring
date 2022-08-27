package com.example.project1.project1.services;

import com.example.project1.project1.entities.Student;
import org.springframework.ui.Model;

import java.util.List;



public interface StudentService {
    public List<Student> listStudents();
    public Student saveStudent(Student student);

    public Student selectStudentId(Long id);

    public Student upgradeStudent(Student student);

    public void deleteStudent(Long id);


}
