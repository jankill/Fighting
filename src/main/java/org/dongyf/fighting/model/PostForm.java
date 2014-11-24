package org.dongyf.fighting.model;

import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;

/**
 * Created by dongyf on 2014-11-24.
 */
public class PostForm
{
    private String postTitle;
    private String postUrl;
    private String postContent;
    private BigInteger orgId;
    private String imageUrl;
    private MultipartFile file;

    public PostForm()
    {
    }

    public PostForm(String postTitle, String postUrl, String postContent, BigInteger orgId, String imageUrl, MultipartFile file)
    {
        this.postTitle = postTitle;
        this.postUrl = postUrl;
        this.postContent = postContent;
        this.orgId = orgId;
        this.imageUrl = imageUrl;
        this.file = file;
    }

    public String getPostTitle()
    {
        return postTitle;
    }

    public void setPostTitle(String postTitle)
    {
        this.postTitle = postTitle;
    }

    public String getPostUrl()
    {
        return postUrl;
    }

    public void setPostUrl(String postUrl)
    {
        this.postUrl = postUrl;
    }

    public String getPostContent()
    {
        return postContent;
    }

    public void setPostContent(String postContent)
    {
        this.postContent = postContent;
    }

    public BigInteger getOrgId()
    {
        return orgId;
    }

    public void setOrgId(BigInteger orgId)
    {
        this.orgId = orgId;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public MultipartFile getFile()
    {
        return file;
    }

    public void setFile(MultipartFile file)
    {
        this.file = file;
    }

    @Override
    public String toString()
    {
        return "PostForm{" +
                "postTitle='" + postTitle + '\'' +
                ", postUrl='" + postUrl + '\'' +
                ", postContent='" + postContent + '\'' +
                ", orgId=" + orgId +
                ", imageUrl='" + imageUrl + '\'' +
                ", file=" + file +
                '}';
    }
}
