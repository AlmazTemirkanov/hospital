package com.hospital.controller;

import com.hospital.domain.Hospital;
import com.hospital.model.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HospitalController {

    @Autowired
    private HospitalRepo hospitalRepo;

    @GetMapping("/")
    public String main(Model model){

        return "main";
    }

    @GetMapping("/main")
    public String filter_hospital_id(@RequestParam(required = false) Integer filter_hospital_id, Model model) {
        Iterable <Hospital> hospital = null;
        if (filter_hospital_id != null ) {
            hospital = hospitalRepo.findAllById(filter_hospital_id);
        }

        model.addAttribute("hospital", hospital);
        model.addAttribute("filter_hospital_id", filter_hospital_id);

        return "main";
    }


}
