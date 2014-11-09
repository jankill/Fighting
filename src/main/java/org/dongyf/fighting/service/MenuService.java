package org.dongyf.fighting.service;

import org.dongyf.fighting.mapper.MenuMapper;
import org.dongyf.fighting.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dongyf on 2014/11/8.
 */
@Service("woqu")
public class MenuService implements ImenuService
{
    @Autowired
    private MenuMapper menuMapper;

    public MenuMapper getMenuMapper()
    {
        return menuMapper;
    }

    public void setMenuMapper(MenuMapper menuMapper)
    {
        this.menuMapper = menuMapper;
    }

    @Override
    public List<Menu> selectMenu(){
      List<Menu> menus= menuMapper.selectMenu();
        return  menus;
    }
}
