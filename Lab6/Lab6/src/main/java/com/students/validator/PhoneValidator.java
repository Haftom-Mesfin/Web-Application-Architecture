package com.students.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements
ConstraintValidator<IntLen, Integer> {
	private int validLen;
	
    @Override
    public void initialize(IntLen constraintAnnotation) {
    	validLen=constraintAnnotation.value();
    }
 
    @Override
    public boolean isValid(Integer phoneField,
      ConstraintValidatorContext cxt) {  
    	if(phoneField != null)
    		return phoneField.toString().length() == validLen;
    	return false;
    }



}
