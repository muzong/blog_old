/**
 * @Author MuZong
 * @create 2021/4/7 16:27
 */
package com.muzong.service.Impl;

import com.muzong.dao.DatabaseDao;
import com.muzong.entity.DataBaseType;
import com.muzong.entity.Database;
import com.muzong.entityAdd.ViewDatabase;
import com.muzong.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DatabaseServiceImpl implements DatabaseService {


    @Autowired
   private DatabaseDao databaseDao;

    @Override
    public Database getDataBaseById(Long databaseId) {
        return databaseDao.getDataBaseById(databaseId);
    }

    @Override
    public List<Database> listDatabase() {
        return databaseDao.getAllDatabase();
    }



    @Override
    public int saveDatabase(Database database) {
        return databaseDao.saveDatabase(database);
    }

    @Override
    public void deleteDatabase(Long databaseId) {
        databaseDao.deleteDatabase(databaseId);
    }


    @Override
    public int updateDatabase(Database database) {

        return databaseDao.updateDatabase(database);
    }

    @Override
    public List<ViewDatabase> getViewDatabaseList() {
        return databaseDao.getViewDatabaseList();
    }

    @Override
    public int saveViewDatabase(ViewDatabase viewDatabase) {
        return databaseDao.saveViewDatabase(viewDatabase);
    }

    @Override
    public ViewDatabase getViewDataBaseById(long viewdatabaseId) {
        return databaseDao.getViewDataBaseById(viewdatabaseId);
    }

    @Override
    public void deleteViewDatabase(Long viewdatabaseId) {
        databaseDao.deleteViewDatabase(viewdatabaseId);
    }

    @Override
    public int ConversionViewDatabase(ViewDatabase viewDatabase) {
        return databaseDao.ConversionViewDatabase(viewDatabase);
    }

    @Override
    public int updateViewDatabase(ViewDatabase viewDatabase) {

        return  databaseDao.updateViewDatabase(viewDatabase);
    }

@Override
  public List<DataBaseType> getViewDataBaseTypeList(){
       return databaseDao.getViewDataBaseTypeList();
  }

    @Override
    public void deleteViewDataBaseType(Long viewDataBaseTypeId) {
        databaseDao.deleteViewDataBaseType(viewDataBaseTypeId);
    }

    @Override
    public int updateViewDataBaseType(DataBaseType dataBaseType) {
        return databaseDao.updateViewDataBaseType(dataBaseType);
    }


    @Override
    public DataBaseType getDataBaseTypeById(Long dataBaseTypeId) {
        return databaseDao.getDataBaseTypeById(dataBaseTypeId);
    }

    @Override
    public int saveDataBaseType(DataBaseType dataBaseType) {
       return databaseDao.saveDataBaseType(dataBaseType);
    }

    @Override
    public List<Database> getviewdatabsebyname(String viewDataBaseTypeName) {
        return databaseDao.getviewdatabsebyname(viewDataBaseTypeName);
    }


}
