/**
 * @Author MuZong
 * @create 2021/4/7 16:29
 */
package com.muzong.dao;

import com.muzong.entity.DataBaseType;
import com.muzong.entity.Database;
import com.muzong.entityAdd.ViewDatabase;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface DatabaseDao {


    Database getDataBaseById(long databaseId);

     List<Database> getAllDatabase();


    int saveDatabase(Database database);


     Long deleteDatabase(Long databaseId);


    int updateDatabase(Database database);

    ///
    List<ViewDatabase> getViewDatabaseList();

     int saveViewDatabase(ViewDatabase viewDatabase);

    ViewDatabase getViewDataBaseById(long viewdatabaseId);

    Long deleteViewDatabase(Long viewdatabaseId);

    int ConversionViewDatabase(ViewDatabase viewDatabase);

    int updateViewDatabase(ViewDatabase viewDatabase);


    List<DataBaseType> getViewDataBaseTypeList();

   long deleteViewDataBaseType(Long viewDataBaseTypeId);

   int updateViewDataBaseType(DataBaseType dataBaseType);

    DataBaseType getDataBaseTypeById(Long viewDataBaseTypeId);

    int saveDataBaseType(DataBaseType dataBaseType);

    List<Database> getviewdatabsebyname(String viewDataBaseTypeName);
}
