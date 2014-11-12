package org.dongyf.fighting.entity;

import java.math.BigInteger;

/**
 * Created by Dongyf on 2014/11/10.
 */
public class Catalog
{
    private BigInteger menuCatalogId;
    private BigInteger menuId;
    private String catalog;
    private String description;
    private BigInteger parent;


    public Catalog()
    {
    }

    public Catalog(BigInteger menuCatalogId, BigInteger menuId, String catalog, String description, BigInteger parent, BigInteger count)
    {
        this.menuCatalogId = menuCatalogId;
        this.menuId = menuId;
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

    public BigInteger getMenuId()
    {
        return menuId;
    }

    public void setMenuId(BigInteger menuId)
    {
        this.menuId = menuId;
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
                ", menuId=" + menuId +
                ", catalog='" + catalog + '\'' +
                ", description='" + description + '\'' +
                ", parent=" + parent +
                '}';
    }
}
