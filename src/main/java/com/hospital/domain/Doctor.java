package com.hospital.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer doctor;
    private String doctor_name;
    private Date joining_date;
    private String speciality;
    private Integer salary;
    private String experience;

    public Integer getDoctor() {
        return doctor;
    }

    public void setDoctor(Integer doctor) {
        this.doctor = doctor;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public Date getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(Date joining_date) {
        this.joining_date = joining_date;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Doctor(String doctor_name, Date joining_date, String speciality, Integer salary, String experience) {
        this.doctor_name = doctor_name;
        this.joining_date = joining_date;
        this.speciality = speciality;
        this.salary = salary;
        this.experience = experience;
    }

    public Doctor() {
    }
}
