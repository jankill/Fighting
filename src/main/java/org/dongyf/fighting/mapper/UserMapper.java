package org.dongyf.fighting.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.dongyf.fighting.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dongyf on 2014/11/3.
 */
@Repository
public interface UserMapper
{

    @Select("SELECT * FROM fighter where uid=#{id}")
    public User findUserById(int id);

    @Select("SELECT * FROM fighter")
    public List<User> findAll();

    @Delete("DELETE FROM fighter where uid=#{id}")
    public boolean delById(int id);

    @Update("UPDATE fighter SET account=10000 WHERE uid=#{id}")
    public boolean update(User user);

    @Insert("INSERT INTO `fightingdb`.`fighters` (`fighter`, `fighterpass`, `account`, `create_date`) VALUES (#{fighter}, #{fighterpass}, '3000', '2014-11-03 19:24:10');")
    public boolean insert(User user);
}
