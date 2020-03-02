package com.hospital.model;

import com.hospital.domain.Hospital;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HospitalRepo extends CrudRepository <Hospital, Integer> {
    List<Hospital> findAllById (Integer id);

}
