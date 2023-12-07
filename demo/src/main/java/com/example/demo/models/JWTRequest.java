package com.example.demo.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class JWTRequest {

    private String email;
    private String password;
}
