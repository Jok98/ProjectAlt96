package com.project.ProjectAlt96.controller;

import com.project.ProjectAlt96.model.dao.UsersDao;
import com.project.ProjectAlt96.model.pojo.Users;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/auth")
public class LogInController {
    @Autowired
    private UsersDao usersDao;

    @GetMapping("/loginApp")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest authRequest) {
        String request =authRequest.getUsername()+" "+authRequest.getPassword();
        System.out.println(request);
        Users user = usersDao.getByUsername(authRequest.getUsername());
        System.out.println(user.toString());

        if (user == null || (!user.getPassword().equals(authRequest.getPassword()))) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        String token = JwtUtils.generateJwtToken(user.getId().toString());

        AuthResponse authResponse = new AuthResponse();
        authResponse.setToken(token);

        return ResponseEntity.ok(authResponse);
    }
}

@Data
@Builder
class AuthRequest {
    private String username;
    private String password;
}

@Data
class AuthResponse {
    private String token;
}