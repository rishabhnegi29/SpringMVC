package com.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	public void initialize(CourseCode theCourseCode) {
		coursePrefix=theCourseCode.value();
	}
	
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result =value.startsWith(coursePrefix);
		return result;
	}

}
