package com.cmh.eurekaclient2.value;

import com.cmh.eurekaclient2.annotation.EnumValidator;
import com.cmh.eurekaclient2.constant.BookStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookQueryCondition {
    private String name;

    private Set<Integer> ids;

    @EnumValidator(canNull = false,value = BookStatusEnum.class)
    private String bookStatus;
}
