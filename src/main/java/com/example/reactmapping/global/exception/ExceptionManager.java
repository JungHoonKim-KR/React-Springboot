package com.example.reactmapping.global.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionManager  {
    @ExceptionHandler(AppException.class)
    public ResponseEntity<?> appExceptionHandler(AppException e){
        return new ResponseEntity<>(createErrorResponse(e),e.getErrorCode().getHttpStatus());
    }

    public Map<String,Object> createErrorResponse(AppException e){
        Map<String,Object> body = new HashMap<>();
        body.put("errorCode", e.getErrorCode().name());
        body.put("errorMessage", e.getMessage());
        return body;
    }
}
