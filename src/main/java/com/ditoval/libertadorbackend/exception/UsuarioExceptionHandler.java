package com.ditoval.libertadorbackend.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class UsuarioExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<UsuarioErrorResponse> usuarioNotFoundHandler(UsuarioNotFoundException exception,
                                                                       HttpServletRequest req) {
        UsuarioErrorResponse error = new UsuarioErrorResponse(
                ZonedDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                req.getRequestURI(),
                exception.getMessage()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
