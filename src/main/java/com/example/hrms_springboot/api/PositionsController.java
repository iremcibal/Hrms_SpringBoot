package com.example.hrms_springboot.api;


import com.example.hrms_springboot.business.abstracts.PositionService;
import com.example.hrms_springboot.core.utilities.results.DataResult;
import com.example.hrms_springboot.core.utilities.results.Result;
import com.example.hrms_springboot.entities.concretes.Positions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionsController {
    private PositionService positionService;

    @Autowired
    public PositionsController(PositionService positionService) {
        this.positionService = positionService;
    }

    /*@GetMapping("/getall")
    public List<Positions> getAll(){
        return this.positionService.getAll();
    }*/

    @GetMapping("/getall")
    public DataResult<List<Positions>> getAll(){
        return this.positionService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Positions positions){ //RequestBody-Bizim gönderdiğimiz datayı paketleyip
        // yeni bir positions açıp eşleştirme işlemini yapıyor
        return this.positionService.add(positions);
    }


}
