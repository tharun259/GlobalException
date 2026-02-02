package com.example.global;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //it gives the control when a invalid statement occurs && assign as global exception
public class GlobalValidation {
	
	@ExceptionHandler(MethodArgumentNotValidException.class) // this is the exp u need to handle
	public ResponseEntity<Map<String,String>> f1(MethodArgumentNotValidException e){
		Map<String,String> mp= new HashMap<>();
		e.getBindingResult().getFieldErrors().forEach((x)->{
			mp.put(x.getField(), x.getDefaultMessage());
		}); // to get all the errors 
		
		return  ResponseEntity.badRequest().body(mp);
	}
	
	@ExceptionHandler(Exception.class) // general exception
	public ResponseEntity<String> f1(Exception e){
		
		return  ResponseEntity.badRequest().body(e.getMessage());
	}
}
