package org.dongyf.fighting.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.dongyf.fighting.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dongyf on 2014/11/8.
 */
@Repository
public interface MenuMapper
{
   @Select(" select MENU_ID as menuId,MENU_NAME as menuName,PARENT_ID as parentId,RANK as rank from menu WHERE PARENT_ID=0 AND RANK=2")
   public List<Menu> selectMenu();
}
