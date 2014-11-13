package org.dongyf.fighting.service;


import org.dongyf.fighting.model.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dongyf on 2014/11/8.
 */
@Service("woqu")
public class MenuService implements ImenuService
{

    @Override
    public List<Menu> selectMenu()
    {
        return null;
    }
}
