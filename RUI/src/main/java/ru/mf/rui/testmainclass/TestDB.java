package ru.mf.rui.testmainclass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ru.mf.rui.db.entity.Test;
import ru.mf.rui.db.service.JdbcCorporateEventDao;

public class TestDB {
	public static void main(String[] args) {
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("file:C:/Users/pavel.krutov/git/github.com/RUI/src/main/webapp/WEB-INF/context-servlet.xml");
		System.out.println("Working Directory = " +
	              System.getProperty("user.dir"));
		
		/*JdbcCorporateEventDao jdbcCorporateEventDao = (JdbcCorporateEventDao)*/ 
		context.getBean("dataSource");
		
		JdbcCorporateEventDao jdbcCorporateEventDao = (JdbcCorporateEventDao) context.getBean("jdbcCorporateEventDao");
		JdbcTemplate jdbcTemplate = jdbcCorporateEventDao.getJdbctemplate();
		int rowCount = jdbcTemplate.queryForObject("select count(*) from test", Integer.class);
		System.err.println(rowCount);
		
		List<Test> test = jdbcTemplate.query("select test from test", 
				new RowMapper<Test>() {
	            public Test mapRow(ResultSet rs, int rowNum) throws SQLException {
	                Test test = new Test();
	                test.setTest(rs.getString("test"));
	                return test;
	            }
        });
		System.err.println(test);

		
		
		/*System.err.println(context.getBeanDefinitionNames());
		System.err.println(getInstantiatedSigletons(context));
		System.err.println(context.getBean("jdbcCorporateEventDao"));*/
		
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
