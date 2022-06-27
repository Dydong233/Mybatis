package com.dyd.dao;

import com.dyd.pojo.User;
import com.dyd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void test(){
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        //遍历
        for (User user : userList) {
            System.out.println(user);
        }
        //关闭sql
        sqlSession.close();
    }

    @Test
    public void testlog4j(){
        logger.info("access!");
        logger.debug("debug!");
        logger.error("error!");
    }
}
