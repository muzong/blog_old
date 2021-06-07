/**
 * @Author MuZong
 * @create 2021/5/5 16:15
 */
package com.muzong.entity;

import java.util.Date;

public class Archive {


    private int id;
    private String content;
    private Date createTime;
    private String picture;

    @Override
    public String toString() {
        return "Archive{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", picture='" + picture + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
