package org.dongyf.fighting.service;

import org.dongyf.fighting.mapper.UserMapper;
import org.dongyf.fighting.model.User;
import org.dongyf.fighting.service.FighterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Dongyf on 2014/11/3.
 */
@Service
public class FighterServiceImpl implements FighterService
{

    private UserMapper mapper;

    @Resource
    public void setMapper(UserMapper mapper)
    {
        this.mapper = mapper;
    }

    @Override
    public User findUserById(int id)
    {
       User user= mapper.findUserById(id);
        return user;
    }

    @Override
    public List<User> findAll()
    {
        List<User> list = mapper.findAll();
        return list;
    }

    @Override
    public boolean insert(User user)
    {
        return false;
    }

    @Override
    public boolean update(User user)
    {
        return false;
    }

    @Override
    public boolean del(int id)
    {
        return false;
    }
}
