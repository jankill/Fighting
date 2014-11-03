package org.dongyf.fighting.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by dongyf on 2014/11/3.
 */
public class User
{
    private int uid;
    private String userName;
    private String userpwd;
    private Date createDate;
    private BigDecimal account;

    public User()
    {
    }

    public User(int uid, String userName, String userpwd, Date createDate, BigDecimal account)
    {
        this.uid = uid;
        this.userName = userName;
        this.userpwd = userpwd;
        this.createDate = createDate;
        this.account = account;
    }

    public int getUid()
    {
        return uid;
    }

    public void setUid(int uid)
    {
        this.uid = uid;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserpwd()
    {
        return userpwd;
    }

    public void setUserpwd(String userpwd)
    {
        this.userpwd = userpwd;
    }

    public Date getCreateDate()
    {
        return createDate;
    }

    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    public BigDecimal getAccount()
    {
        return account;
    }

    public void setAccount(BigDecimal account)
    {
        this.account = account;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "uid='" + uid + '\'' +
                ", userName='" + userName + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", createDate=" + createDate +
                ", account=" + account +
                '}';
    }
}
