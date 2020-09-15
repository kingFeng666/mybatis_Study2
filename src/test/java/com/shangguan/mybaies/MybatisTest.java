package com.shangguan.mybaies;

import com.shangguan.Mybatis.MybatisUtil;
import com.shangguan.Mybatis.mapper.SchoolMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @ClassName: MybatisTest
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 09月 16 0:25
 * @Version 1.0
 */
public class MybatisTest {
    SqlSession sqlSession=MybatisUtil.getSqlSession();
    @Test
    public void queryAll(){
        SchoolMapper mapper = sqlSession.getMapper(SchoolMapper.class);
        System.out.println(mapper.queryAll());
    }
    @Test
    public void queryById(){
        SchoolMapper mapper = sqlSession.getMapper(SchoolMapper.class);
        System.out.println(mapper.queryById(2));
    }

}
