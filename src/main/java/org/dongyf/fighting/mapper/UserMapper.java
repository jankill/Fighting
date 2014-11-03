package org.dongyf.fighting.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.dongyf.fighting.model.User;

import java.util.List;

/**
 * Created by dongyf on 2014/11/3.
 */
public interface UserMapper
{

    @Select("SELECT * FROM fighter where uid=#{id}")
    public User findUserById(int id);

    @Select("SELECT * FROM fighter")
    public List<User> findAll();
    @Delete("DELETE FROM fighter where uid=#{id}")
    public boolean delById(int id);
    @Update("UPDATE fighter SET acconut=10000 WHERE uid=#{id}")
    public boolean update(User user);
    @Insert("")
    public boolean insert(User user);
}
