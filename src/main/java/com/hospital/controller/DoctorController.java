package com.hospital.controller;

import com.hospital.domain.Doctor;
import com.hospital.model.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @Autowired
    private DoctorRepo doctorRepo;

    @GetMapping("/doctor")
    public String filter_doctor(@RequestParam(required = false) Integer filter_doctor, Model model) {
        Iterable <Doctor> doctor = null;
        if (filter_doctor != null ) {
            doctor = doctorRepo.findAllByDoctor(filter_doctor);
        }

        model.addAttribute("doctor", doctor);
        model.addAttribute("filter_doctor", filter_doctor);

        return "main";
    }

}
