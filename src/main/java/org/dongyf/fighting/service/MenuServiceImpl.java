package org.dongyf.fighting.service;


import org.dongyf.fighting.mapper.MenuMapper;
import org.dongyf.fighting.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dongyf on 2014/11/8.
 */
@Service()
public class MenuServiceImpl implements MenuService
{

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> selectOrgs(String actionUrl)
    {
        List<Menu> menus = menuMapper.selectOrgs(actionUrl);
        return menus;
    }

    @Override
    public List<Menu> selectAll()
    {
        List<Menu> menus = menuMapper.selectAll();
        return menus;
    }
}
