package com.sdag9.controller;

import com.sdag9.model.School;
import com.sdag9.model.Student;
import com.sdag9.repositories.SchoolRepository;
import com.sdag9.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    private final SchoolRepository schoolRepository;
    private final StudentRepository studentRepository;

    @Autowired
    public IndexController(SchoolRepository schoolRepository, StudentRepository studentRepository) {
        this.schoolRepository = schoolRepository;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public String getIndex(Model model){
        Iterable<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        Iterable<School> schools = schoolRepository.findAll();
        model.addAttribute("schools", schools);
        return "index";
    }


}
