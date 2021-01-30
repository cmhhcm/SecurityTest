package com.cmh.paramsvalidation.service;

import com.cmh.paramsvalidation.value.BookQueryCondition;
import com.cmh.paramsvalidation.vo.BookVO;

import java.util.List;

public interface IBookServiceInterface {
    void addBook(BookVO bookVO);

    void updateBook(BookVO bookVO);

    void deleteBook(Integer id);

    BookVO getById(Integer id);

    List<BookVO> getBooks(BookQueryCondition condition);
}
