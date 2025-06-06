package com.gabrielferreira02.timepedia.exceptions;

import com.gabrielferreira02.timepedia.dto.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.rmi.ServerException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServerException.class)
    public ResponseEntity<ExceptionResponse> serverExceptionHandler(ServerException e) {
        return new ResponseEntity<>(new ExceptionResponse(e.getMessage()), HttpStatus.SERVICE_UNAVAILABLE);
    }
}
