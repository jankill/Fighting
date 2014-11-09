package org.dongyf.fighting.model;

import java.util.Date;

/**
 * Created by Dongyf on 2014/11/8.
 */
public class Menu
{

    private String menuId;
    private String menuName;
    private String parentId;
    private String rank;
    private Date createDate;

    public Menu()
    {

    }

    public Menu(String menuId, String menuName, String parentId, String rank, Date createDate)
    {
        this.menuId = menuId;
        this.menuName = menuName;
        this.parentId = parentId;
        this.rank = rank;
        this.createDate = createDate;
    }

    public String getMenuId()
    {
        return menuId;
    }

    public void setMenuId(String menuId)
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

    public String getParentId()
    {
        return parentId;
    }

    public void setParentId(String parentId)
    {
        this.parentId = parentId;
    }

    public String getRank()
    {
        return rank;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    public Date getCreateDate()
    {
        return createDate;
    }

    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    @Override
    public String toString()
    {
        return "Menu{" +
                "menuId='" + menuId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", parentId='" + parentId + '\'' +
                ", rank='" + rank + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
