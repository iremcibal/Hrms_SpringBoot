package com.example.hrms_springboot.dataAccess.abstracts;

import com.example.hrms_springboot.entities.concretes.Positions;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PositionsDao extends JpaRepository<Positions,Integer> {



}
