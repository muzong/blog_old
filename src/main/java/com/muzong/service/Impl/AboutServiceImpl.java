/**
 * @Author MuZong
 * @create 2021/5/6 20:26
 */
package com.muzong.service.Impl;


import com.muzong.dao.AboutDao;
import com.muzong.entity.About;
import com.muzong.entity.Archive;
import com.muzong.service.AboutService;
import com.muzong.util.MarkdownUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class AboutServiceImpl implements AboutService {
    @Autowired
    private AboutDao aboutDao;
    @Override
    public About getAbout() {
                 About about=aboutDao.getAbout();
        String content = about.getContent();
        about.setContent(MarkdownUtils.markdownToHtmlExtensions(content));



        return about;
    }

    @Override
    public int updateAbout(About about) {

        about.setCreateTime(new Date());
        return aboutDao.updateAbout(about);
    }

}
