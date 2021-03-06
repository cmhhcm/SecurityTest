package com.cmh.eurekaclient2.annotation;


import com.cmh.eurekaclient2.validation.EnumValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy ={EnumValidation.class} )
public @interface EnumValidator {

    boolean canNull() default true;

    Class<?> value();

    String message() default "enum val is illegal";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
