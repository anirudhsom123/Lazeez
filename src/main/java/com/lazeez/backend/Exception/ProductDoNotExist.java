package com.lazeez.backend.Exception;

public class ProductDoNotExist extends RuntimeException{

    public ProductDoNotExist(String msg){

        super(msg);
    }
}
