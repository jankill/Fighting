package org.dongyf.fighting.service;

import org.dongyf.fighting.mapper.UserMapper;
import org.dongyf.fighting.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dongyf on 2014/11/3.
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User u)
    {
        User user =userMapper.login(u);
        return user;
    }

    @Override
    public int updateUser(User user)
    {
       int count = userMapper.updateUser(user);
        return count;
    }

    @Override
    public int insertUser(User user)
    {
        int count = userMapper.insertUser(user);
        return count;
    }
}
