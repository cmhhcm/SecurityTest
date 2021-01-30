package com.cmh.paramsvalidation.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BusinessException extends Exception {
    private int code;

    private String message;
}
