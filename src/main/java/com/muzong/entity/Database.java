/**
 * @Author MuZong
 * @create 2021/4/7 16:04
 */
package com.muzong.entity;

public class Database  {

    private Long dataBaseId;
    private String dataBaseType;
    private String dataBaseUrl;
    private String dataBaseTitle;
    private String dataBaseContent;

    @Override
    public String toString() {
        return "Database{" +
                "dataBaseId=" + dataBaseId +
                ", dataBaseType='" + dataBaseType + '\'' +
                ", dataBaseUrl='" + dataBaseUrl + '\'' +
                ", dataBaseTitle='" + dataBaseTitle + '\'' +
                ", dataBaseContent='" + dataBaseContent + '\'' +
                '}';
    }

    public Long getDataBaseId() {
        return dataBaseId;
    }

    public void setDataBaseId(Long dataBaseId) {
        this.dataBaseId = dataBaseId;
    }

    public String getDataBaseType() {
        return dataBaseType;
    }

    public void setDataBaseType(String dataBaseType) {
        this.dataBaseType = dataBaseType;
    }

    public String getDataBaseUrl() {
        return dataBaseUrl;
    }

    public void setDataBaseUrl(String dataBaseUrl) {
        this.dataBaseUrl = dataBaseUrl;
    }

    public String getDataBaseTitle() {
        return dataBaseTitle;
    }

    public void setDataBaseTitle(String dataBaseTitle) {
        this.dataBaseTitle = dataBaseTitle;
    }

    public String getDataBaseContent() {
        return dataBaseContent;
    }

    public void setDataBaseContent(String dataBaseContent) {
        this.dataBaseContent = dataBaseContent;
    }
}

