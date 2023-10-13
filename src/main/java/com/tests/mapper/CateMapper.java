package com.tests.mapper;

import com.tests.pojo.Cate;

import java.util.List;

public interface CateMapper {
    public List<Cate> selectAll();

//
//    添加操作
    void add(Cate cate);


//修改
    int update (Cate cate);

//删除（根据获取id)
    void deleteById(int categoryId);

}
