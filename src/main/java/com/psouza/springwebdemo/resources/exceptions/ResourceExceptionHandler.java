package com.psouza.springwebdemo.resources.exceptions;

import com.psouza.springwebdemo.services.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        int status = HttpStatus.NOT_FOUND.value();
        String error = "Resource not found";
        StandardError err = new StandardError(Instant.now(), status, error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
