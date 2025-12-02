package com.lazeez.backend.Controller;


import com.lazeez.backend.DTO.Request.CustomerRequest;
import com.lazeez.backend.DTO.Response.CustomerResponse;
import com.lazeez.backend.Exception.CustomerAlreadyExistException;
import com.lazeez.backend.Exception.CustomerDoNotExist;
import com.lazeez.backend.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody CustomerRequest customerRequest){
        try{
            CustomerResponse customerResponse= customerService.addCustomer(customerRequest);

            return new ResponseEntity(customerResponse,HttpStatus.OK);
        }catch (CustomerAlreadyExistException e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity getCustomer(@PathVariable("id") int id){

        try{
            CustomerResponse customerResponse=customerService.getCustomer(id);
             return new ResponseEntity(customerResponse,HttpStatus.OK);
        }catch (CustomerDoNotExist e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity deleteCustomer(@PathVariable("id") int id){
        try{

            return new ResponseEntity(customerService.deleteCustomer(id),HttpStatus.OK);
        } catch (CustomerDoNotExist e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }


    }


}
