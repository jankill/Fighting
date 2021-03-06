package org.dongyf.fighting.model;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by Dongyf on 2014/11/10.
 */
public class Catalog
{
    private BigInteger menuCatalogId;
    private List<Menu> menus;
    private String catalog;
    private String description;
    private BigInteger parent;


    public Catalog()
    {
    }

    public Catalog(BigInteger menuCatalogId, List<Menu> menus, String catalog, String description, BigInteger parent, BigInteger count)
    {
        this.menuCatalogId = menuCatalogId;
        this.menus = menus;
        this.catalog = catalog;
        this.description = description;
        this.parent = parent;

    }

    public BigInteger getMenuCatalogId()
    {
        return menuCatalogId;
    }

    public void setMenuCatalogId(BigInteger menuCatalogId)
    {
        this.menuCatalogId = menuCatalogId;
    }

    public List<Menu> getMenus()
    {
        return menus;
    }

    public void setMenus(List<Menu> menus)
    {
        this.menus = menus;
    }

    public String getCatalog()
    {
        return catalog;
    }

    public void setCatalog(String catalog)
    {
        this.catalog = catalog;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public BigInteger getParent()
    {
        return parent;
    }

    public void setParent(BigInteger parent)
    {
        this.parent = parent;
    }



    @Override
    public String toString()
    {
        return "Catalog{" +
                "menuCatalogId=" + menuCatalogId +
                ", menus=" + menus +
                ", catalog='" + catalog + '\'' +
                ", description='" + description + '\'' +
                ", parent=" + parent +
                '}';
    }
}
