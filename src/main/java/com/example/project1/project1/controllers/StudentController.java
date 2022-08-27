package com.example.project1.project1.controllers;
import com.example.project1.project1.entities.Student;
import com.example.project1.project1.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping({"/students" , "/"})
    public String listarStudent(Model modelo){
        modelo.addAttribute("students", studentService.listStudents());
        return "students";
    };

    @GetMapping("/students/new")
    public String newStudentForm(Model modelo){
        Student student = new Student();
        modelo.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:students";
    }

    @GetMapping("/students/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.selectStudentId(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String upgradeStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model){
        Student studentSelected = studentService.selectStudentId(id);
        studentSelected.setId(id);
        studentSelected.setNombre(student.getNombre());
        studentSelected.setApellido(student.getApellido());
        studentSelected.setEmail(student.getEmail());
        studentService.upgradeStudent(studentSelected);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}
