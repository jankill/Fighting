package org.dongyf.fighting.entity;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by Dongyf on 2014/11/12.
 */
public class Relationships
{
    private BigInteger rId;
    private BigInteger postId;

    public Relationships()
    {
    }

    public Relationships(BigInteger rId, BigInteger postId)
    {
        this.rId = rId;
        this.postId = postId;
    }

    public BigInteger getrId()
    {
        return rId;
    }

    public void setrId(BigInteger rId)
    {
        this.rId = rId;
    }

    public BigInteger getPostId()
    {
        return postId;
    }

    public void setPostId(BigInteger postId)
    {
        this.postId = postId;
    }

    @Override
    public String toString()
    {
        return "Relationships{" +
                "rId=" + rId +
                ", postId=" + postId +
                '}';
    }
}
