package com.sx.test;

import com.tests.mapper.CateMapper;
import com.tests.mapper.CityMapper;
import com.tests.pojo.Cate;
import com.tests.pojo.City;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test2 {
    //查询
    @Test
    public void testSelectAll() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession =sqlSessionFactory.openSession();

        //City city = sqlSession.selectOne("getCityById", 1);

//        CityMapper mapper = sqlSession.getMapper(CityMapper.class);
//        List<City> citys = mapper.selectAll();
//        for (City city : citys) {
//            System.out.println(citys);
//        }

        CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
        City city = cityMapper.getCityWithCountry(6);
        System.out.println(city);
//        sqlSession.close();


    }
}
