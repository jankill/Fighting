package org.dongyf.fighting.mapper;

import org.dongyf.fighting.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by dongyf on 2014/11/3.
 */
@Repository("userMapper")
public interface UserMapper
{

    public User login(User user);

    public int updateUser(User user);

    public int insertUser(User user);
}
