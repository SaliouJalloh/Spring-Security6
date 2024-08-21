package com.example.security.service;

import com.example.security.service.payload.request.AuthenticationRequest;
import com.example.security.service.payload.request.RegisterRequest;
import com.example.security.service.payload.response.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse authenticate(AuthenticationRequest request);
    AuthenticationResponse register(RegisterRequest request);

}
