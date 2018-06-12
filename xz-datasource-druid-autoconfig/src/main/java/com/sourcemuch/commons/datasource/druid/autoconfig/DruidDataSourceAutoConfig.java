package com.sourcemuch.commons.datasource.druid.autoconfig;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@ConditionalOnProperty(prefix = DruidDataSourceAutoConfig.PROPERTIEX_NAME, name="enabled", havingValue = "true")
public class DruidDataSourceAutoConfig {
	
	public static final String PROPERTIEX_NAME = "sourcemuch.commons.datasource.druid"; 
	
	
	@ConfigurationProperties(prefix = PROPERTIEX_NAME)
	@Bean(initMethod = "init", destroyMethod = "close")
	public DataSource dataSource() throws Exception{
		DruidDataSource ds = new DruidDataSource();
		return ds;
	}
	

}
