package com.sdag9.controller;

import com.sdag9.model.School;
import com.sdag9.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/school")
public class SchoolController {


    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @GetMapping("/add/")
    public String getAddView(Model model){
        model.addAttribute("school", new School());
        return "addSchool.html";
    }

    @PostMapping("/add/")
    public String processAddschoolView(@Valid School school, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "addschool";
        }
        schoolRepository.save(school);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String processDeleteschool(@PathVariable Long id){
        schoolRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String getEditView(Model model, @PathVariable Long id) {
        Optional<School> schoolOpt = schoolRepository.findById(id);
        if (!schoolOpt.isPresent()) {
            return "redirect:/";
        }
        model.addAttribute("school", schoolOpt.get());
        return "editschool.html";
    }

    @PostMapping("/edit/")
    public String editschool(@Valid School school, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "editschool";
        }
        schoolRepository.save(school);
        return "redirect:/";
    }

}
