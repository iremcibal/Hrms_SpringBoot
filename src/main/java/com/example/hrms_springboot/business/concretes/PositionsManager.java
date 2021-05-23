package com.example.hrms_springboot.business.concretes;

import com.example.hrms_springboot.business.abstracts.PositionService;
import com.example.hrms_springboot.core.utilities.results.DataResult;
import com.example.hrms_springboot.core.utilities.results.Result;
import com.example.hrms_springboot.core.utilities.results.SuccessDataResult;
import com.example.hrms_springboot.core.utilities.results.SuccessResult;
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

    /*@Override
    public List<Positions> getAll() {
        return this.positionsDao.findAll();
    }*/
    @Override
    public DataResult<List<Positions>> getAll() { //error hatasını da döndürebileceğimiz için dataResult kullanıyruz
        return new SuccessDataResult<List<Positions>>
                (this.positionsDao.findAll(), "Data listelendi");
    }

    @Override
    public Result add(Positions positions) {
        this.positionsDao.save(positions);
        return new SuccessResult("Yeni pozisyon eklendi");
    }

}
