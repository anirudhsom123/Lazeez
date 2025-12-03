package com.lazeez.backend.Exception;

public class SellerDoNotExist extends RuntimeException{

    public SellerDoNotExist(String msg){
        super(msg);
    }
}
