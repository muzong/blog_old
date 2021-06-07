/**
 * @Author MuZong
 * @create 2021/4/12 19:56
 */
package com.muzong.entityAdd;

public class ViewDatabase {


    private Long viewDataBaseId;
    private String viewDataBaseUrl;
     private String viewDataBaseTitle;
     private String viewDataBaseContent;
     private String viewDataBaseType;

    @Override
    public String toString() {
        return "ViewDatabase{" +
                "viewDataBaseId=" + viewDataBaseId +
                ", viewDataBaseUrl='" + viewDataBaseUrl + '\'' +
                ", viewDataBaseTitle='" + viewDataBaseTitle + '\'' +
                ", viewDataBaseContent='" + viewDataBaseContent + '\'' +
                ", viewDataBaseType='" + viewDataBaseType + '\'' +
                '}';
    }

    public Long getViewDataBaseId() {
        return viewDataBaseId;
    }

    public void setViewDataBaseId(Long viewDataBaseId) {
        this.viewDataBaseId = viewDataBaseId;
    }

    public String getViewDataBaseUrl() {
        return viewDataBaseUrl;
    }

    public void setViewDataBaseUrl(String viewDataBaseUrl) {
        this.viewDataBaseUrl = viewDataBaseUrl;
    }

    public String getViewDataBaseTitle() {
        return viewDataBaseTitle;
    }

    public void setViewDataBaseTitle(String viewDataBaseTitle) {
        this.viewDataBaseTitle = viewDataBaseTitle;
    }

    public String getViewDataBaseContent() {
        return viewDataBaseContent;
    }

    public void setViewDataBaseContent(String viewDataBaseContent) {
        this.viewDataBaseContent = viewDataBaseContent;
    }

    public String getViewDataBaseType() {
        return viewDataBaseType;
    }

    public void setViewDataBaseType(String viewDataBaseType) {
        this.viewDataBaseType = viewDataBaseType;
    }
}
