package org.dongyf.fighting.mapper;

import org.dongyf.fighting.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dongyf on 2014/11/13.
 */
@Repository
public interface MenuMapper
{
    public List<Menu> selectOrgs(String actionUrl);

    public List<Menu> selectAll();
}
