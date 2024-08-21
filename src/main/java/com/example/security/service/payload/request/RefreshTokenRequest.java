package com.example.security.service.payload.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//permet d'encapsuler les données de la requête de rafraîchissement du token
public class RefreshTokenRequest {
    private String refreshToken;
}
