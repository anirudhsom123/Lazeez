package com.lazeez.backend.Transformer;

import com.lazeez.backend.DTO.Request.SellerRequest;
import com.lazeez.backend.DTO.Response.SellerResponse;
import com.lazeez.backend.Model.Seller;

import java.util.ArrayList;

public class SellerTransformer {

    public static Seller sellerRequestToSeller(SellerRequest sellerRequest){
        return Seller.builder()
                .name(sellerRequest.getName())
                .pan(sellerRequest.getPan())
                .email(sellerRequest.getEmail())
                .build();
    }

    public  static  SellerResponse sellerToSellerResponse(Seller seller){
        return SellerResponse.builder()
                .name(seller.getName())
                .email(seller.getEmail())
                .build();
    }
}
