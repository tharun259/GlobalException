package com.example.global;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
 
public class PatternValidation implements ConstraintValidator<PasswordValidate, String>{
 
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		String strongPasswordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&^#_\\-])[A-Za-z\\d@$!%*?&^#_\\-]{10,}$";
		
		return arg0.matches(strongPasswordRegex);
	}
 
}