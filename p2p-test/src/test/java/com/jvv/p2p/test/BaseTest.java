package com.jvv.p2p.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import javax.annotation.Resource;
import javax.sql.DataSource;

@ContextConfiguration(locations = { "classpath*:spring/**/spring-*.xml" })
public abstract class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

	protected Log log = LogFactory.getLog(this.getClass());

	@Resource(name = "dataSource")
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}



}
