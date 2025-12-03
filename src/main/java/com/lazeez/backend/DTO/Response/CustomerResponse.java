package com.lazeez.backend.DTO.Response;

import com.lazeez.backend.Enum.Gender;
import com.lazeez.backend.Model.Cart;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerResponse {

    private String name;

    private int age;

    private String email;

    private Gender gender;

    private String mobNo;

    private Cart cart;
}
