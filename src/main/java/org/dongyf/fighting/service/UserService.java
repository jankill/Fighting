package org.dongyf.fighting.service;

import org.dongyf.fighting.model.User;

/**
 * Created by Dongyf on 2014/11/3.
 */

public interface UserService
{


    public User login(User user);

    public int updateUser(User user);

    public int insertUser(User user);


}
