package org.dongyf.fighting.model;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by Dongyf on 2014/11/8.
 */
public class Menu
{

    private BigInteger menuId;
    private String name;
    private String enName;
    private BigInteger menuGroup;

    public Menu()
    {
    }

    public Menu(BigInteger menuId, String name, String enName, BigInteger menuGroup)
    {
        this.menuId = menuId;
        this.name = name;
        this.enName = enName;
        this.menuGroup = menuGroup;
    }

    public BigInteger getMenuId()
    {
        return menuId;
    }

    public void setMenuId(BigInteger menuId)
    {
        this.menuId = menuId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEnName()
    {
        return enName;
    }

    public void setEnName(String enName)
    {
        this.enName = enName;
    }

    public BigInteger getMenuGroup()
    {
        return menuGroup;
    }

    public void setMenuGroup(BigInteger menuGroup)
    {
        this.menuGroup = menuGroup;
    }

    @Override
    public String toString()
    {
        return "Menu{" +
                "menuId=" + menuId +
                ", name='" + name + '\'' +
                ", enName='" + enName + '\'' +
                ", menuGroup=" + menuGroup +
                '}';
    }
}
