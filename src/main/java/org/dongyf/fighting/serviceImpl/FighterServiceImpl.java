package org.dongyf.fighting.serviceImpl;

import org.dongyf.fighting.mapper.UserMapper;
import org.dongyf.fighting.model.User;
import org.dongyf.fighting.service.FighterService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Dongyf on 2014/11/3.
 */

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
        mapper.findUserById(id);
        return null;
    }

    @Override
    public List<User> findAll()
    {
        return null;
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
