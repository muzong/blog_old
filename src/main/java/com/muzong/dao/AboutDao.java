/**
 * @Author MuZong
 * @create 2021/5/6 17:19
 */
package com.muzong.dao;


import com.muzong.entity.About;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AboutDao  {


    About getAbout();

    int updateAbout(About about);
}
