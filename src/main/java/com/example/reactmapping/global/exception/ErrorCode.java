package com.example.reactmapping.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@Getter
public enum ErrorCode {
    NOTFOUND(HttpStatus.NOT_FOUND,""),
    DUPLICATED(HttpStatus.CONFLICT,""),
    //잘못된 접근
    ACCESS_ERROR(HttpStatus.UNAUTHORIZED,""),
    TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED,"");

    private HttpStatus httpStatus;
    private String message;
}
