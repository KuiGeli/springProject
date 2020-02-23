package com.sdag9.controller;


import com.sdag9.model.Student;
import com.sdag9.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {

    private  final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }



    @GetMapping("/add/")
    public String getAddView(Model model){
        model.addAttribute("student", new Student());
        return "addStudent.html";
    }

    @PostMapping("/add/")
    public String processAddStudentView(@Valid Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "addStudent";
        }
        studentRepository.save(student);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String processDeleteStudent(@PathVariable Long id){
        studentRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String getEditView(Model model, @PathVariable Long id) {
        Optional<Student> studentOpt = studentRepository.findById(id);
        if (!studentOpt.isPresent()) {
            return "redirect:/";
        }
        model.addAttribute("student", studentOpt.get());
        return "editStudent.html";
    }

    @PostMapping("/edit/")
    public String editStudent(@Valid Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "editStudent";
        }
        studentRepository.save(student);
        return "redirect:/";
    }

}
