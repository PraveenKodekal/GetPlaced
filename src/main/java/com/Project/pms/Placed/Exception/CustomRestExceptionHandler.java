package com.Project.pms.Placed.Exception;

import java.util.Date;
import java.util.Set;

import com.Project.pms.Placed.Exception.StudentLoginExceptions.StudentMobileNoNotFoundException;
import com.Project.pms.Placed.Exception.StudentLoginExceptions.StudentRegNoNotFoundException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.util.CollectionUtils;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
// @ControllerAdvice used to handle the Exceptions globally across the diffrent Modules of the project
// and Also it gives Aspect Oriented Programming feature to java

public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {

	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		CustomErrorDetails customErrorDetails = new CustomErrorDetails(new Date(),
				"REst Exceptions from MethodArguementNotValid Exception", ex.getMessage());

		return new ResponseEntity<Object>(customErrorDetails, HttpStatus.BAD_REQUEST);
	}

	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		CustomErrorDetails customErrorDetails = new CustomErrorDetails(new Date(),
				"Rest Exceptions from HttpMethodNotFound Exception- Request Correct method", ex.getMessage());

		return new ResponseEntity<Object>(customErrorDetails, HttpStatus.BAD_REQUEST);

	}
	
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(
			HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

		CustomErrorDetails customErrorDetails = new CustomErrorDetails(new Date(),
				"Rest Exceptions from HttpMessageNotReadableException from handler", ex.getMessage());

		return new ResponseEntity<Object>(customErrorDetails, HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// CUstomed Global Exception Handling
	
	public ResponseEntity<Object> studentRegNoHandler(StudentRegNoNotFoundException ex, WebRequest webRequest){
		CustomErrorDetails customErrorDetails = new CustomErrorDetails(new Date(),
				 ex.getMessage(), webRequest.getDescription(false));

		return new ResponseEntity<Object>(customErrorDetails, HttpStatus.NOT_FOUND);
		
	}
	
	public ResponseEntity<Object> studentMObileNotRegistered(StudentMobileNoNotFoundException ex, WebRequest webRequest){
		
		CustomErrorDetails customErrorDetails = new CustomErrorDetails(new Date(),
				 ex.getMessage(), webRequest.getDescription(false));

		return new ResponseEntity<Object>(customErrorDetails, HttpStatus.NOT_FOUND);
		
		
		
		
		
	}

}
