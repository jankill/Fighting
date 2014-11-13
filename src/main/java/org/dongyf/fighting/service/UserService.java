package org.dongyf.fighting.service;

import org.dongyf.fighting.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dongyf on 2014/11/3.
 */

public interface UserService
{


    public User login(User user);

    public int updateUser(User user);

    public int insertUser(User user);


}
