/**
 * @Author MuZong
 * @create 2021/5/6 18:33
 */
package com.muzong.service;


import com.muzong.entity.About;
import org.springframework.stereotype.Service;

public interface AboutService {


    About getAbout();

    int updateAbout(About about);

}
