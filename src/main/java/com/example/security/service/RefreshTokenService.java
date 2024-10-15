package com.example.security.service;

import com.example.security.entities.RefreshToken;
import com.example.security.service.payload.request.RefreshTokenRequest;
import com.example.security.service.payload.response.RefreshTokenResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseCookie;

import java.util.Optional;

public interface RefreshTokenService {

    Optional<RefreshToken> findByRefreshToken(String token);

    /*
    La méthode createRefreshToken est responsable de la création d'un nouveau RefreshToken
    pour un utilisateur spécifié (récupéré à partir de son ID). Elle génère un token unique à l'aide
    de UUID.randomUUID(), l'encode en Base64, définit la date d'expiration en fonction
    de la durée configurée, puis enregistre le token en base de données.
     */
    RefreshToken createRefreshToken(Long userId);

    /*
    La méthode verifyExpiration est utilisée pour vérifier si le RefreshToken est expiré.
     Si le token est nul ou est expiré, une exception de type TokenException est levée.
     */
    RefreshToken verifyExpiration(RefreshToken token);

    /*
    La méthode generateNewToken est appelée lorsqu'un utilisateur souhaite générer
    un nouveau token en utilisant un RefreshToken existant. Elle récupère le token
    de la base de données, vérifie s'il est expiré, récupère l'utilisateur associé au token,
     génère un nouveau token JWT à l'aide du JwtService, puis renvoie la réponse.
     */
    RefreshTokenResponse generateNewToken(RefreshTokenRequest request);

    ResponseCookie generateRefreshTokenCookie(String token);

    String getRefreshTokenFromCookies(HttpServletRequest request);

    void deleteByToken(String token);

    ResponseCookie getCleanRefreshTokenCookie();
}
