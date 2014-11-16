package org.dongyf.fighting.mapper;


import org.dongyf.fighting.model.Menu;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class MenuMapperImplTest extends TestBase
{

    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void testSelectOrgs() throws Exception
    {
        List<Menu> menus = menuMapper.selectOrgs("mma");
        for (Menu m : menus)
        {
            System.out.println(m);
        }

    }
}