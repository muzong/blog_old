/**
 * @Author MuZong
 * @create 2021/5/5 16:26
 */
package com.muzong.service.Impl;

import com.muzong.dao.ArchiveDao;
import com.muzong.entity.Archive;
import jdk.nashorn.internal.objects.annotations.Where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ArchiveServiceImpl implements com.muzong.service.ArchiveService {

    @Autowired
    private ArchiveDao archiveDao;

    @Override
    public List<Archive> getAllArchives() {
        return archiveDao.getAllArchives();
    }

    @Override
    public int saveArchive(Archive archive) {
        Date date = new Date();
        archive.setCreateTime(date);
      if (archive.getPicture().equals("null")){

          archive.setPicture("https://pic4.zhimg.com/80/v2-9ca6464e878f7f3e124e147f270a22fb_720w.jpg");


      }


        return archiveDao.saveArchive(archive);
    }

    @Override
    public void deleteArchive(Long id) {

    }
}
