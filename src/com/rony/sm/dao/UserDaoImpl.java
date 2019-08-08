package com.rony.sm.dao;

import com.rony.sm.mapper.UserQueryMapper;
import com.rony.sm.po.User;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public User findUserByID(int id) throws Exception {
        return  getSqlSession().selectOne("test.findUserByID",id);
    }
    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring_config.xml");
//        UserDao dao= (UserDao) context.getBean("userDao");
//        System.out.println(dao.findUserByID(2012).toString());
        UserQueryMapper query= (UserQueryMapper) context.getBean("userQueryMapper");
        System.out.println(query.findUserByID(2));

    }
}
