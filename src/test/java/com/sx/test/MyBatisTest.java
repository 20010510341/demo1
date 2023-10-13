package com.sx.test;

import com.tests.mapper.CateMapper;
import com.tests.pojo.Cate;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.naming.Name;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.List;

public class MyBatisTest {


//查询
    @Test
    public void testSelectAll() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession =sqlSessionFactory.openSession();

        CateMapper cateMapper =sqlSession.getMapper(CateMapper.class);

        List<Cate> cates = cateMapper.selectAll();
        System.out.println(cates);
        sqlSession.close();


    }

//添加
    @Test
    public void testAdd() throws IOException {

        String name="张三666";
        LocalDateTime lastUpdate= LocalDateTime.parse("2023-10-13T14:30:30");

        Cate cate =new Cate();
        cate.setName(name);
        cate.setLastUpdate(lastUpdate);


        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        SqlSession sqlSession =sqlSessionFactory.openSession();
        SqlSession sqlSession =sqlSessionFactory.openSession(true);
//自动提交
        CateMapper cateMapper =sqlSession.getMapper(CateMapper.class);

        cateMapper.add(cate);

        sqlSession.commit();

        sqlSession.close();

    }

    //修改操作

        @Test
        public void testUpdate() throws IOException {

            String name = "李四666";
            LocalDateTime lastUpdate = LocalDateTime.parse("2023-10-13T14:50:30");
            int categoryId=1;

            Cate cate = new Cate();
            cate.setName(name);
            cate.setLastUpdate(lastUpdate);
            cate.setCategoryId(categoryId);


            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        SqlSession sqlSession =sqlSessionFactory.openSession();
            SqlSession sqlSession = sqlSessionFactory.openSession(true);

            CateMapper cateMapper = sqlSession.getMapper(CateMapper.class);

            int count = cateMapper.update(cate);
            System.out.println(count);
            sqlSession.commit();

            sqlSession.close();
        }

//删除

    @Test
    public void testDeleteById() throws IOException {

        int categoryId=18;

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        SqlSession sqlSession =sqlSessionFactory.openSession();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        CateMapper cateMapper = sqlSession.getMapper(CateMapper.class);
        cateMapper.deleteById(categoryId);
        sqlSession.commit();

        sqlSession.close();
    }


}
