package org.dongyf.fighting.model;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by Dongyf on 2014/11/12.
 */
public class Relationships
{
    private BigInteger rId;
    private List<Post> posts;

    public Relationships()
    {
    }

    public Relationships(BigInteger rId, List<Post> posts)
    {
        this.rId = rId;
        this.posts = posts;
    }

    public BigInteger getrId()
    {
        return rId;
    }

    public void setrId(BigInteger rId)
    {
        this.rId = rId;
    }

    public List<Post> getPosts()
    {
        return posts;
    }

    public void setPosts(List<Post> posts)
    {
        this.posts = posts;
    }

    @Override
    public String toString()
    {
        return "Relationships{" +
                "rId=" + rId +
                ", posts=" + posts +
                '}';
    }
}
