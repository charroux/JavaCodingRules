package com.charroux.javaCodingRules.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * server.error.include-message=always is necessary in application.properties
 */
@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
public class DataException extends Exception{
    public DataException(String message) {
        super(message);
    }
}
