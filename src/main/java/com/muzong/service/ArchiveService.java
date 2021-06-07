/**
 * @Author MuZong
 * @create 2021/5/5 16:14
 */
package com.muzong.service;

import com.muzong.entity.Archive;

import java.util.List;

public interface ArchiveService {

   List<Archive> getAllArchives();

   int saveArchive(Archive archive);

   void deleteArchive(Long id);




}
