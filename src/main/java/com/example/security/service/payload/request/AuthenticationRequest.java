package com.example.security.service.payload.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//permet d'encapsuler les données de la requête d'authentification
public class AuthenticationRequest {
    private String email;
    private String password;
}
