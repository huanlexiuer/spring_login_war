package com.example.war.mapper;

import com.example.war.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * FROM `user` where name = #{name} and password = #{password};")
    User getUserByNameAndPassword(@Param("name") String name, @Param("password")  String pasword);
}
