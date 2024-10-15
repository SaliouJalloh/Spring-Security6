package com.example.security.service;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseCookie;
import org.springframework.security.core.userdetails.UserDetails;

/*
interface qui définit des méthodes permettant de:
    générer, extraire et valider les JWT.
 */
public interface JwtService {

    String extractUserName(String token); // extrait le nom d'utilisateur à partir du JWT.

    String generateToken(UserDetails user); // génère un nouveau JWT à partir des informations de l'utilisateur fourni.

    /*
    Cette méthode vérifie si un JWT est valide en comparant le nom d'utilisateur extrait du JWT avec
    le nom d'utilisateur fourni par UserDetails. Elle vérifie également si le JWT a expiré.
     */
    boolean isTokenValid(String token, UserDetails userDetails);

    ResponseCookie generateJwtCookie(String jwt);

    String getJwtFromCookies(HttpServletRequest request);

    ResponseCookie getCleanJwtCookie();
}
