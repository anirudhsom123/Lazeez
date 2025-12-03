package com.lazeez.backend.Exception;

public class SellerAlreadyExist extends  RuntimeException{

    public SellerAlreadyExist(String msg){
        super(msg);
    }
}
