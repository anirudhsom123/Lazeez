package com.lazeez.backend.DTO.Response;

import com.lazeez.backend.Enum.Category;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponse {

    private String name;

    private int price;

    private Category category;

    private  SellerResponse seller;
}
