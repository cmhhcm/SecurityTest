package com.cmh.eurekaclient2.validation;

import com.cmh.eurekaclient2.annotation.EnumValidator;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class EnumValidation implements ConstraintValidator<EnumValidator, Object> {

    private List<Object> values = new ArrayList<>();

    private boolean canNull;

    @Override
    public void initialize(EnumValidator enumValidator) {
        Class<?> clazz = enumValidator.value();
        canNull = enumValidator.canNull();
        Object[] enumConstants = clazz.getEnumConstants();
        Arrays.stream(enumConstants).forEach(e -> values.add(e.toString()));
    }

    @Override
    public boolean isValid(Object val, ConstraintValidatorContext constraintValidatorContext) {
        if (canNull) {
            return true;
        }
        if (val instanceof String) {
            String str = (String) val;
            return StringUtils.isNotEmpty(str) && values.contains(str);
        }
        return !Objects.isNull(val) && values.contains(val);
    }
}
