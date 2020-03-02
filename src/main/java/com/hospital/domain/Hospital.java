package com.hospital.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String hospital_name;
    private Integer bed_count;


    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public Integer getBed_count() {
        return bed_count;
    }

    public void setBed_count(Integer bed_count) {
        this.bed_count = bed_count;
    }

    public Hospital(String hospital_name, Integer bed_count) {
        this.hospital_name = hospital_name;
        this.bed_count = bed_count;
    }

    public Hospital() {
    }
}
