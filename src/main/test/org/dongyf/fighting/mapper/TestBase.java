package org.dongyf.fighting.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by Dongyf on 2014/11/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:conf/application-config.xml"})
public class TestBase
{
    protected Log loger = LogFactory.getLog(TestBase.class);
}
