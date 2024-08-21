package com.example.security.service.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter @Setter
@Builder
// permet d'encapsuler les données de la réponse d'authentification
public class AuthenticationResponse {

    private Long id;
    private String email;
    private List<String> roles;

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("token_type")
    private String tokenType;
}
