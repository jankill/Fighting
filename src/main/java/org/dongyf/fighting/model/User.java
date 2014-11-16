package org.dongyf.fighting.model;


import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by dongyf on 2014/11/3.
 */
public class User implements Serializable
{
   public static final long serialVersionUID = 1231231231l;
    private BigInteger id;
    private String userLogin;
    private String userPass;
    private String userNickName;
    private String userEmail;
    private Date userRegistered;

    public User()
    {
    }

    public User(BigInteger id, String userLogin, String userPass, String userNickName, String userEmail, Date userRegistered)
    {
        this.id = id;
        this.userLogin = userLogin;
        this.userPass = userPass;
        this.userNickName = userNickName;
        this.userEmail = userEmail;
        this.userRegistered = userRegistered;
    }

    public BigInteger getId()
    {
        return id;
    }

    public void setId(BigInteger id)
    {
        this.id = id;
    }

    public String getUserLogin()
    {
        return userLogin;
    }

    public void setUserLogin(String userLogin)
    {
        this.userLogin = userLogin;
    }

    public String getUserPass()
    {
        return userPass;
    }

    public void setUserPass(String userPass)
    {
        this.userPass = userPass;
    }

    public String getUserNickName()
    {
        return userNickName;
    }

    public void setUserNickName(String userNickName)
    {
        this.userNickName = userNickName;
    }

    public String getUserEmail()
    {
        return userEmail;
    }

    public void setUserEmail(String userEmail)
    {
        this.userEmail = userEmail;
    }

    public Date getUserRegistered()
    {
        return userRegistered;
    }

    public void setUserRegistered(Date userRegistered)
    {
        this.userRegistered = userRegistered;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "userPass='" + userPass + '\'' +
                ", userNickName='" + userNickName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userRegistered=" + userRegistered +
                ", userLogin='" + userLogin + '\'' +
                ", id=" + id +
                '}';
    }
}
