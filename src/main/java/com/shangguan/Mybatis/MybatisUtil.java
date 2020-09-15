package com.shangguan.Mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
/**
 * @ClassName: MybatisUtil
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 09月 15 21:25
 * @Version 1.0
 */
public class MybatisUtil {
     static SqlSessionFactory sqlSessionFactory=null;
    static {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //自动关闭  继承了Closeable
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
    }

}
