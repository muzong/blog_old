/**
 * @Author MuZong
 * @create 2021/4/7 16:23
 */
package com.muzong.service;

import com.muzong.entity.DataBaseType;
import com.muzong.entity.Database;
import com.muzong.entityAdd.ViewDatabase;

import java.util.List;

public interface DatabaseService {

    Database getDataBaseById(Long databaseId);
    //查询资源列表
    List<Database> listDatabase();

    //保存资源
    int saveDatabase(Database database);

    //删除资源
    void deleteDatabase(Long databaseId);

//    修改资源
  int updateDatabase(Database database);

    List<ViewDatabase> getViewDatabaseList();

    int saveViewDatabase(ViewDatabase viewDatabase);

    ViewDatabase getViewDataBaseById(long viewdatabaseId);

    void deleteViewDatabase(Long viewdatabaseId);

    int ConversionViewDatabase(ViewDatabase viewDatabase);

    int updateViewDatabase(ViewDatabase viewDatabase);


    List<DataBaseType> getViewDataBaseTypeList();

    void deleteViewDataBaseType(Long viewDataBaseTypeId);

     int updateViewDataBaseType(DataBaseType dataBaseType);

     DataBaseType getDataBaseTypeById(Long viewDataBaseTypeId);

     int saveDataBaseType(DataBaseType dataBaseType);

     List<Database> getviewdatabsebyname(String viewDataBaseTypeName);
}

