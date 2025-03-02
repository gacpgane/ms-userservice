package com.cpg.userservice.exception;

import com.cpg.userservice.dto.Error;
import com.cpg.userservice.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserNotFoundAdvice {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleException(UserNotFoundException exception) {
        ErrorResponse errorResponse = new ErrorResponse();
        Error error = new Error();
        error.setMessage(exception.getMessage());
        error.setCode("USER_NOT_FOUND");
        errorResponse.setError(error);
        return errorResponse;
    }
}
