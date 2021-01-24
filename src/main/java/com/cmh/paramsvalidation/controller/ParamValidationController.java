package com.cmh.paramsvalidation.controller;

import com.cmh.paramsvalidation.vo.CsvInjectionVO;
import com.cmh.paramsvalidation.vo.ResponseVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params_validation")
public class ParamValidationController {

    @PostMapping("prevent_csv_injection")
    public ResponseVO testPreventCsvInjectionAnnotation(@RequestBody @Validated CsvInjectionVO csvInjectionVO) {
        return ResponseVO.success(csvInjectionVO);
    }
}
