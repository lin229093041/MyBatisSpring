package com.rony.sm.mapper;

import com.rony.sm.po.User;

public interface UserQueryMapper {
    public User findUserByID(int id);
}
