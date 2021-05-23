package com.example.hrms_springboot.business.abstracts;

import com.example.hrms_springboot.core.utilities.results.DataResult;
import com.example.hrms_springboot.core.utilities.results.Result;
import com.example.hrms_springboot.entities.concretes.Positions;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PositionService {
    //List<Positions> getAll();
    DataResult<List<Positions>> getAll();
    Result add(Positions positions);

}
