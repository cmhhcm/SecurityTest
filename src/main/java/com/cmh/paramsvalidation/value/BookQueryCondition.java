package com.cmh.paramsvalidation.value;

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

}
