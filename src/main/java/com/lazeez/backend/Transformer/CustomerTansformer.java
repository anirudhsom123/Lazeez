package com.lazeez.backend.Transformer;

import com.lazeez.backend.DTO.Request.CustomerRequest;
import com.lazeez.backend.DTO.Response.CustomerResponse;
import com.lazeez.backend.Model.Cart;
import com.lazeez.backend.Model.Customer;

public class CustomerTansformer {

    public  static Customer customerRequestToCustomer(CustomerRequest customerRequest){
        return Customer.builder()
                .name(customerRequest.getName())
                .age(customerRequest.getAge())
                .email(customerRequest.getEmail())
                .mobNo(customerRequest.getMobNo())
                .gender(customerRequest.getGender())
                .build();
    }

    public  static CustomerResponse customerToCustomerResponse(Customer customer){
        return CustomerResponse.builder()
                .name(customer.getName())
                .age(customer.getAge())
                .mobNo(customer.getMobNo())
                .email(customer.getEmail())
                .gender(customer.getGender())
                .cart(customer.getCart())
                .build();
    }


}
