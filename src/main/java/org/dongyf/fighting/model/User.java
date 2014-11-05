package org.dongyf.fighting.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by dongyf on 2014/11/3.
 */
public class User
{
    private int uid;
    private String fighter;
    private String fighterPass;
    private Date create_date;
    private BigDecimal account;

    public User()
    {

    }

    public User(int uid, String fighter, String fighterPass, Date create_date, BigDecimal account)
    {
        this.uid = uid;
        this.fighter = fighter;
        this.fighterPass = fighterPass;
        this.create_date = create_date;
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

    public String getFighter()
    {
        return fighter;
    }

    public void setFighter(String fighter)
    {
        this.fighter = fighter;
    }

    public String getFighterPass()
    {
        return fighterPass;
    }

    public void setFighterPass(String fighterPass)
    {
        this.fighterPass = fighterPass;
    }

    public Date getCreate_date()
    {
        return create_date;
    }

    public void setCreate_date(Date create_date)
    {
        this.create_date = create_date;
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
                "uid=" + uid +
                ", fighter='" + fighter + '\'' +
                ", fighterPass='" + fighterPass + '\'' +
                ", create_date=" + create_date +
                ", account=" + account +
                '}';
    }
}
