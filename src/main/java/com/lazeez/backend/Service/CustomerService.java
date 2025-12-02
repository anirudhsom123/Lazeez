package com.lazeez.backend.Service;

import com.lazeez.backend.DTO.Request.CustomerRequest;
import com.lazeez.backend.DTO.Response.CustomerResponse;
import com.lazeez.backend.Exception.CustomerAlreadyExistException;
import com.lazeez.backend.Exception.CustomerDoNotExist;
import com.lazeez.backend.Model.Customer;
import com.lazeez.backend.Repository.CustomerRepository;
import com.lazeez.backend.Transformer.CustomerTansformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    public CustomerResponse addCustomer(CustomerRequest customerRequest) {

        List<Customer> optionalCustomer=customerRepository.findByEmail(customerRequest.getEmail());

        if(optionalCustomer.size()>0){
            throw new CustomerAlreadyExistException("Customer Already exist with same mail");
        }

        Customer customer = CustomerTansformer.customerRequestToCustomer(customerRequest);
        customerRepository.save(customer);
        CustomerResponse customerResponse=CustomerTansformer.customerToCustomerResponse(customer);

        return customerResponse;
    }


    public CustomerResponse getCustomer(int id) {

        Optional<Customer> optionalCustomer=customerRepository.findById(id);

        if(optionalCustomer.isEmpty()){
            throw new CustomerDoNotExist("Customer dont exist");
        }

        Customer customer=optionalCustomer.get();

        CustomerResponse customerResponse=CustomerTansformer.customerToCustomerResponse(customer);
        return  customerResponse;
    }

    public String deleteCustomer(int id) {

        Optional<Customer> optionalCustomer=customerRepository.findById(id);

        if(optionalCustomer.isEmpty()){
            throw new CustomerDoNotExist("no such customer to delete");

        }
       customerRepository.deleteById(id);

        return "Deleted" ;

    }
}
