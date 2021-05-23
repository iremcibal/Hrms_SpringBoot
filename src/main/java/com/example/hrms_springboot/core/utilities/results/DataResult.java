package com.example.hrms_springboot.core.utilities.results;

import com.example.hrms_springboot.entities.concretes.Positions;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class DataResult<T> extends Result{
    //Birden fazla veri tipiyle çalışma durumunda generic yapıda çalışırız
    //Data döndürmem gerekiyor T Generic yapıda
    private T data;
    public DataResult(T data,boolean success, String message) {
        super(success, message); //base sınıfının constructorlarını çalıştırmaya yarar.
        this.data = data;
    }
    public DataResult(T data,boolean success) {
        super(success);
        this.data = data;
    }
    public T getDate() {
        return this.data;
    }



}
