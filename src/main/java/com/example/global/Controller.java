package com.example.global;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.global.entity.UserEntity;

import jakarta.validation.Valid;


@RestController
@RequestMapping
public class Controller {
	@GetMapping("/m")
	public ResponseEntity<String> f1() {
		
		return new ResponseEntity<String>("Welcme To Spring Rest Services from global", HttpStatus.OK);
	}
	
	

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@Valid @RequestBody UserEntity request) {
       
        return ResponseEntity.ok("Signed up");
    }


}
