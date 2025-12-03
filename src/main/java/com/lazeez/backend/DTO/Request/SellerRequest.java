package com.lazeez.backend.DTO.Request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SellerRequest {

    private String name;

    private String pan;

    private String email;
}
