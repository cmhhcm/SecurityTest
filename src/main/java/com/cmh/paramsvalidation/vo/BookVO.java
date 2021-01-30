package com.cmh.paramsvalidation.vo;

import com.cmh.paramsvalidation.mark.Del;
import com.cmh.paramsvalidation.mark.Update;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookVO {

    private Integer id;

    @NotNull
    @NotEmpty
    private String name;

    private Integer status = 1;

    private String createdUser;

    private LocalDate createdTime;

    private String updatedBy;

    private LocalDate updatedTime;
}
