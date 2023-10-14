package com.project.ProjectAlt96.controller;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtils {
    private static final String SECRET_KEY = "your-secret-key"; // Replace with your secret key
    private static final long EXPIRATION_TIME = 864_000_000; // 10 days in milliseconds

    public static String generateJwtToken(String subject) {
        // Define the claims for the JWT
        Map<String, Object> claims = new HashMap<>();
        claims.put("sub", subject); // Subject of the token (usually the user ID)
        claims.put("iat", new Date().getTime()); // Issued at time
        claims.put("exp", new Date(System.currentTimeMillis() + EXPIRATION_TIME).getTime()); // Expiration time

        // Build the JWT token
        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

}
