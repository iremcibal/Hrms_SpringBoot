package com.example.hrms_springboot.core.utilities.results;


//Result'tan base sınıfını kullanıp başarı durumunu burada veriyoruz.
public class SuccessResult extends Result{
    public SuccessResult(){
        super(true);
    }
    public SuccessResult(String message){
        super(true,message);
    }


}
