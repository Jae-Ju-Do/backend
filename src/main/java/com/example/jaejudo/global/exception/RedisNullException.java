package com.example.jaejudo.global.exception;

import com.example.jaejudo.global.exception.errorcode.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RedisNullException extends RuntimeException {

    private final ErrorCode errorCode;
}