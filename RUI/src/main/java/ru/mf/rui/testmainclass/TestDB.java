package ru.mf.rui.testmainclass;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.mf.rui.db.ejb.BaseDao;
import ru.mf.rui.db.entity.BaseRow;
import ru.mf.rui.db.service.JdbcCorporateEventDao;

import java.util.ArrayList;
import java.util.List;

public class TestDB {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:C:/Users/pavel.krutov/git/github.com/RUI/src/main/webapp/WEB-INF/context-servlet.xml");
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        context.getBean("dataSource");

        JdbcCorporateEventDao jdbcCorporateEventDao = (JdbcCorporateEventDao) context.getBean("jdbcCorporateEventDao");
        JdbcTemplate jdbcTemplate = jdbcCorporateEventDao.getJdbctemplate();
        //	int rowCount = jdbcTemplate.queryForObject("select count(*) from test", Integer.class);
        //	System.err.println(rowCount);

        BaseDao baseDao = new BaseDao(jdbcTemplate, "select * from test");
        List<BaseRow> rowList = baseDao.getRowList(null);
        for (BaseRow row : rowList) {
            row.printRowToConsole();
        }
    }


    public static List<Object> getInstantiatedSigletons(ApplicationContext ctx) {
        List<Object> singletons = new ArrayList<Object>();

        String[] all = ctx.getBeanDefinitionNames();

        ConfigurableListableBeanFactory clbf = ((AbstractApplicationContext) ctx).getBeanFactory();
        for (String name : all) {
            Object s = clbf.getSingleton(name);
            if (s != null)
                singletons.add(s);
        }

        return singletons;

    }
}
