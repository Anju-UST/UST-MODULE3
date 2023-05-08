package com.response.Exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {
	@ResponseStatus(HttpStatus.NOT_FOUND)
	//@ExceptionHandler(MethodArgumentNotValidException.class)//with trace 
//	public Map<String,String> abc(MethodArgumentNotValidException ex){
//		Map<String,String> m=new HashMap<>();
//		ex.getBindingResult().getFieldErrors().forEach(error->{m.put(error.getField(), error.getDefaultMessage());});
//		return m;
//	}
	@ExceptionHandler(BlogAlreadyExists.class)
	public ResponseEntity<String> handleBlog(){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found!!!!!!!.......");
	}

	

}
