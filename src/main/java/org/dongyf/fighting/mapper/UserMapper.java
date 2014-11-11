package org.dongyf.fighting.mapper;

import org.dongyf.fighting.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dongyf on 2014/11/3.
 */
@Repository("userMapper")
public interface UserMapper
{

    public User findUserById(int id);

    public List<User> findAll();

    public boolean delById(int id);

    public boolean update(User user);

    public boolean insert(User user);
}
