package com.example.auth.controllers;

import com.example.auth.models.User;
import com.example.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    UserRepository userrepo;
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content.";
    }
    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
    public String moderatorAccess() {
        return "Moderator Board.";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }
    @GetMapping("/get")

    public ResponseEntity<List<User>> getAllAds(){
        List<User> ads=userrepo.findAll();
        return new ResponseEntity<>(ads, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity <?> deleteAds(@PathVariable("id") long id){
       userrepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
