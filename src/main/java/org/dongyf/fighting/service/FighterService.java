package org.dongyf.fighting.service;

import org.dongyf.fighting.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dongyf on 2014/11/3.
 */

public interface FighterService
{


    public User findUserById(int id);

    public List<User> findAll();

    public boolean insert(User user);

    public boolean update(User user);

    public boolean del(int id);
}
