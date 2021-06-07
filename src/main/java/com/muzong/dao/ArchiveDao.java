/**
 * @Author MuZong
 * @create 2021/5/5 16:27
 */
package com.muzong.dao;


import com.muzong.entity.Archive;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArchiveDao {


    List<Archive> getAllArchives();

    int saveArchive(Archive archive);

    void deleteArchive(Long id);

}
