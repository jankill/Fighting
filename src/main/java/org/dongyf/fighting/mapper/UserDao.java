package org.dongyf.fighting.mapper;

import org.apache.ibatis.session.SqlSession;
import org.dongyf.fighting.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dongyf on 2014/11/13.
 */
public class UserDao
{
    private UserMapper userMapper;
    @Autowired
    private SqlSession sqlSession;

    public UserDao()
    {
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    public User login(User u)
    {
        User user = userMapper.login(u);
        return user;
    }


    public int updateUser(User user)
    {
        int i = userMapper.updateUser(user);
        return i;
    }


    public int insertUser(User user)
    {
        int i = userMapper.insertUser(user);
        return i;
    }
}
