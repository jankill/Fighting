package org.dongyf.fighting.model;


import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by Dongyf on 2014/11/8.
 */
public class Menu implements Serializable
{


    private BigInteger menuId;
    private String menuName;
    private String fullName;
    private String actionUrl;

    public Menu()
    {
    }

    public Menu(BigInteger menuId, String menuName, String fullName, String actionUrl)
    {
        this.menuId = menuId;
        this.menuName = menuName;
        this.fullName = fullName;
        this.actionUrl = actionUrl;
    }

    public BigInteger getMenuId()
    {
        return menuId;
    }

    public void setMenuId(BigInteger menuId)
    {
        this.menuId = menuId;
    }

    public String getMenuName()
    {
        return menuName;
    }

    public void setMenuName(String menuName)
    {
        this.menuName = menuName;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public String getActionUrl()
    {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl)
    {
        this.actionUrl = actionUrl;
    }

    @Override
    public String toString()
    {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", actionUrl='" + actionUrl + '\'' +
                '}';
    }
}
