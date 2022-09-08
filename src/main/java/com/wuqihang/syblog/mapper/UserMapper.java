package com.wuqihang.syblog.mapper;

import com.wuqihang.syblog.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Wuqihang
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM AUSER WHERE ID = #{id}")
    User getUserById(String id);

    @Select("SELECT * FROM AUSER")
    User getAllUsers();

    @Update("UPDATE AUSER SET PASSWORD = #{password} WHERE ID = #{id}")
    User update(User user);

    @Delete("DELETE FROM AUSER WHERE ID = #{id}")
    void delete();

    @Insert("INSERT INTO AUSER (ID, USERNAME, PASSWORD) VALUES ( #{id}, #{username}, #{password})")
    boolean insert(User user);

    @Select("SELECT * FROM AUSER WHERE USERNAME = #{username} AND PASSWORD = #{password}")
    User getUserByUsernameAndPassword(String username, String password);

    @Select("SELECT * FROM AUSER WHERE USERNAME = #{username}")
    User getUserByUsername(String username);
}
