package com.hospital.model;

import com.hospital.domain.Doctor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DoctorRepo extends CrudRepository<Doctor, Integer> {
    List<Doctor> findAllByDoctor (Integer doctor);
}
