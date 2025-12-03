package com.lazeez.backend.DTO.Request;

import com.lazeez.backend.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {

    private String name;

    private int age;

    private String email;

    private Gender gender;

    private String mobNo;

}
