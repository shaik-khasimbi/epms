package com.epms.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epms.entity.Nurse;

@Repository
public interface NurseRepository  extends JpaRepository<Nurse, Integer>{

}
