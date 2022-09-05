package com.mavipsBoot.MavipCrud.controller;

import com.mavipsBoot.MavipCrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralControler {
    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/student")
    public String getEmpty(Model model){
        model.addAttribute("studentList",studentRepo.findAll());
        return "index.html";
    }

}

