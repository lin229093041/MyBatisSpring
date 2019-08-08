package com.rony.sm.dao;

import com.rony.sm.po.User;

public interface UserDao {
    public User findUserByID(int id) throws Exception;
}
