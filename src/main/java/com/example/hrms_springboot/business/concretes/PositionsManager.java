package com.example.hrms_springboot.business.concretes;

import com.example.hrms_springboot.business.abstracts.PositionService;
import com.example.hrms_springboot.dataAccess.abstracts.PositionsDao;
import com.example.hrms_springboot.entities.concretes.Positions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionsManager implements PositionService {
    private PositionsDao positionsDao;

    @Autowired
    public PositionsManager(PositionsDao positionsDao) {
        this.positionsDao = positionsDao;
    }

    @Override
    public List<Positions> getAll() {
        return this.positionsDao.findAll();
    }
}
