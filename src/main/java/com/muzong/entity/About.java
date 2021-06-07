/**
 * @Author MuZong
 * @create 2021/5/6 17:18
 */
package com.muzong.entity;

import java.util.Date;

public class About {
    private int id;
    private String content;
    private Date createTime;

    @Override
    public String toString() {
        return "About{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
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
}
