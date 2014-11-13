package org.dongyf.fighting.model;

import org.dongyf.fighting.entity.User;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by Dongyf on 2014/11/10.
 */
public class Post
{
    private BigInteger postId; //文章ID ID
    private User postAuthor;//文章作者 post_author
    private Date postDate;//发表时间 post_date
    private String postContent;//文章内容 post_content
    private String postTitle;//文章标题 post_title
    private String postExcerpt;//文章摘要 post_excerpt
    private String postName;//标题缩略名 post_name
    private String commentStatus;//评论状态open/closed comment_status
    private BigInteger commentCount;//评论数、 comment_count
    private Date postModified;//修改时间 post_modified

    public Post()
    {
    }

    public Post(BigInteger postId, User postAuthor, Date postDate, String postContent, String postTitle, String postExcerpt, String postName, String commentStatus, BigInteger commentCount, Date postModified)
    {
        this.postId = postId;
        this.postAuthor = postAuthor;
        this.postDate = postDate;
        this.postContent = postContent;
        this.postTitle = postTitle;
        this.postExcerpt = postExcerpt;
        this.postName = postName;
        this.commentStatus = commentStatus;
        this.commentCount = commentCount;
        this.postModified = postModified;
    }

    public BigInteger getPostId()
    {
        return postId;
    }

    public void setPostId(BigInteger postId)
    {
        this.postId = postId;
    }

    public User getPostAuthor()
    {
        return postAuthor;
    }

    public void setPostAuthor(User postAuthor)
    {
        this.postAuthor = postAuthor;
    }

    public Date getPostDate()
    {
        return postDate;
    }

    public void setPostDate(Date postDate)
    {
        this.postDate = postDate;
    }

    public String getPostContent()
    {
        return postContent;
    }

    public void setPostContent(String postContent)
    {
        this.postContent = postContent;
    }

    public String getPostTitle()
    {
        return postTitle;
    }

    public void setPostTitle(String postTitle)
    {
        this.postTitle = postTitle;
    }

    public String getPostExcerpt()
    {
        return postExcerpt;
    }

    public void setPostExcerpt(String postExcerpt)
    {
        this.postExcerpt = postExcerpt;
    }

    public String getPostName()
    {
        return postName;
    }

    public void setPostName(String postName)
    {
        this.postName = postName;
    }

    public String getCommentStatus()
    {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus)
    {
        this.commentStatus = commentStatus;
    }

    public BigInteger getCommentCount()
    {
        return commentCount;
    }

    public void setCommentCount(BigInteger commentCount)
    {
        this.commentCount = commentCount;
    }

    public Date getPostModified()
    {
        return postModified;
    }

    public void setPostModified(Date postModified)
    {
        this.postModified = postModified;
    }

    @Override
    public String toString()
    {
        return "Post{" +
                "postId=" + postId +
                ", postAuthor=" + postAuthor +
                ", postDate=" + postDate +
                ", postContent='" + postContent + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", postExcerpt='" + postExcerpt + '\'' +
                ", postName='" + postName + '\'' +
                ", commentStatus='" + commentStatus + '\'' +
                ", commentCount=" + commentCount +
                ", postModified=" + postModified +
                '}';
    }
}
