package com.cmh.paramsvalidation.mapper;

import com.cmh.paramsvalidation.value.BookQueryCondition;
import com.cmh.paramsvalidation.vo.BookVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper
public interface BookMapper {
    boolean insert(BookVO bookVO);

    boolean update(BookVO bookVO);

    void del(Integer id);

    BookVO getById(Integer id);

    List<BookVO> getBooks(BookQueryCondition condition);
}
