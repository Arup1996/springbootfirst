package com.arupproject.arupproject.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LoginController {

    private final AuthenticationManager authenticationManager;

	public LoginController(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	@PostMapping("/login")
	public ResponseEntity<Authentication> login(@RequestBody LoginRequest loginRequest) {
		UsernamePasswordAuthenticationToken authenticationRequest =
			UsernamePasswordAuthenticationToken.unauthenticated(loginRequest.username(), loginRequest.password());
		Authentication authenticationResponse =
			(Authentication) this.authenticationManager.authenticate(authenticationRequest);
            
        return new ResponseEntity<Authentication>(authenticationResponse
        ,HttpStatus.OK);
	}

	public record LoginRequest(String username, String password) {
	}

	

}
