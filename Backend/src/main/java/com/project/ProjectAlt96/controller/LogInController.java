package com.project.ProjectAlt96.controller;

import com.project.ProjectAlt96.model.dao.UsersDao;
import com.project.ProjectAlt96.model.pojo.Users;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/auth")
public class LogInController {
    @Autowired
    private UsersDao usersDao;

    @PostMapping(path = "/save")
    public ResponseEntity<String>  saveUser(@RequestBody Users user)
    {

        //Blocca l'operazione se password o email non sono presenti
        if (user.getPassword().equals("") || user.getEmail().equals("")){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        usersDao.save(user);
        return ResponseEntity.ok("Utente registrato con successo!");


    }

    @PostMapping(path = "/login")
    public ResponseEntity<String>  loginUser(@RequestBody Users user)
    {
        if(user == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }


        Users use = usersDao.getByUsername(user.getUsername());
        if(use != null && use.getPassword().equals(user.getPassword()) && use.getUsername().equals(user.getUsername())){

        return ResponseEntity.ok("Utente Loggato con successo!");}
        else{  return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Utente non trovato");}

    }



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