/**
 * @Author MuZong
 * @create 2021/5/1 11:47
 */
package com.muzong.entity;

public class DataBaseType {
    private String viewDataBaseTypeName;
    private Long viewDataBaseTypeId;

    public String getViewDataBaseTypeName() {
        return viewDataBaseTypeName;
    }

    public void setViewDataBaseTypeName(String viewDataBaseTypeName) {
        this.viewDataBaseTypeName = viewDataBaseTypeName;
    }

    public Long getViewDataBaseTypeId() {
        return viewDataBaseTypeId;
    }

    public void setViewDataBaseTypeId(Long viewDataBaseTypeId) {
        this.viewDataBaseTypeId = viewDataBaseTypeId;
    }

    @Override
    public String toString() {
        return "DataBaseType{" +
                "viewDataBaseTypeName='" + viewDataBaseTypeName + '\'' +
                ", viewDataBaseTypeId=" + viewDataBaseTypeId +
                '}';
    }
}
