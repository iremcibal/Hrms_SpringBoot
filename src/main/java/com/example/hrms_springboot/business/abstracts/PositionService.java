package com.example.hrms_springboot.business.abstracts;

import com.example.hrms_springboot.entities.concretes.Positions;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PositionService {
    List<Positions> getAll();

}
