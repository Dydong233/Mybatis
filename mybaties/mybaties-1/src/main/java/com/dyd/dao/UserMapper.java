package com.dyd.dao;

import com.dyd.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> getUserByLimit(Map<String,Integer> map);

    @Select("select * from user where id = #{id}")
    List<User> getUserById(@Param("id") int id);
    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);
    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int uid);
}