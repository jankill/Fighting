package org.dongyf.fighting.service;

import org.dongyf.fighting.model.Menu;

import java.util.List;

/**
 * Created by Dongyf on 2014/11/15.
 */
public interface MenuService
{
    public List<Menu> selectOrgs(String actionUrl);

    public List<Menu> selectAll();
}
