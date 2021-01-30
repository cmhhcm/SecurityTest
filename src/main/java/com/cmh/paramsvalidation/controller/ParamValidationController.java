package com.cmh.paramsvalidation.controller;

import com.cmh.paramsvalidation.service.IBookServiceInterface;
import com.cmh.paramsvalidation.value.BookQueryCondition;
import com.cmh.paramsvalidation.vo.BookVO;
import com.cmh.paramsvalidation.vo.CsvInjectionVO;
import com.cmh.paramsvalidation.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("params_validation")
public class ParamValidationController {

    @Autowired
    private IBookServiceInterface bookService;

    @PostMapping("prevent_csv_injection")
    public ResponseVO testPreventCsvInjectionAnnotation(@RequestBody @Validated CsvInjectionVO csvInjectionVO) {
        return ResponseVO.success(csvInjectionVO);
    }

    @PostMapping("book")
    public void addBook(@RequestBody BookVO bookVO) {
        bookService.addBook(bookVO);
    }

    @PostMapping("book/update")
    public void updateBook(@RequestBody BookVO bookVO) {
        bookService.updateBook(bookVO);
    }

    @PostMapping("book/del/{id}")
    public void delBook(@PathVariable Integer id) {
        bookService.deleteBook(id);
    }

    @GetMapping("/book/{id}")
    public ResponseVO getBookById(@PathVariable Integer id) {
        return ResponseVO.success(bookService.getById(id));
    }

    @PostMapping("book/list")
    public ResponseVO getBooks(@RequestBody @Validated BookQueryCondition condition) {
        return ResponseVO.success(bookService.getBooks(condition));
    }
}
