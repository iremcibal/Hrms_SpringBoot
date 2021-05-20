package com.example.hrms_springboot.api;


import com.example.hrms_springboot.business.abstracts.PositionService;
import com.example.hrms_springboot.entities.concretes.Positions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionsController {
    private PositionService positionService;

    @Autowired
    public PositionsController(PositionService positionService) {
        this.positionService = positionService;
    }


    @GetMapping("/getall")
    public List<Positions> getAll(){
        return this.positionService.getAll();
    }

}
