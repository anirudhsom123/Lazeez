package com.lazeez.backend.DTO.Request;

import com.lazeez.backend.Enum.Gender;
import com.lazeez.backend.Model.Cart;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

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
