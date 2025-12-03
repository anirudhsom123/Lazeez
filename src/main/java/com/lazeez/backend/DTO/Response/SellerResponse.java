package com.lazeez.backend.DTO.Response;

import com.lazeez.backend.Model.Product;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SellerResponse {

    private String name;


    private String email;

}
