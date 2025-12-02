package com.lazeez.backend.DTO.Response;

import com.lazeez.backend.Enum.Gender;
import com.lazeez.backend.Model.Cart;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

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
