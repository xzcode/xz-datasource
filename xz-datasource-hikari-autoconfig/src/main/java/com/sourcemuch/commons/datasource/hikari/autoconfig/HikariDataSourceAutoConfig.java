package com.sourcemuch.commons.datasource.hikari.autoconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ConditionalOnProperty(prefix = HikariDataSourceAutoConfig.PROPERTIEX_NAME, name="enabled", havingValue = "true")
public class HikariDataSourceAutoConfig {
	
	public static final String PROPERTIEX_NAME = "sourcemuch.commons.datasource.hikari"; 
	
	@Bean
	public DataSource dataSource(){
		HikariConfig hikariConfig = hikariConfig();
		HikariDataSource ds = new HikariDataSource(hikariConfig);
		
		return ds;
	}
	
	@Bean
	@ConfigurationProperties(prefix = PROPERTIEX_NAME)
	public HikariConfig hikariConfig(){
		HikariConfig config = new HikariConfig();
		config.setDataSourceProperties(hikariDataSourceProperties());
		return config;
		
	}
	
	@Bean
	@ConfigurationProperties(prefix = PROPERTIEX_NAME + ".properties")
	public Properties hikariDataSourceProperties(){
		Properties props = new Properties();
		props.setProperty("cachePrepStmts", "true");
		props.setProperty("prepStmtCacheSize", "250");
		props.setProperty("prepStmtCacheSqlLimit", "2048");
		props.setProperty("useServerPrepStmts", "true");
		props.setProperty("useLocalSessionState", "true");
		props.setProperty("useLocalTransactionState", "true");
		props.setProperty("rewriteBatchedStatements", "true");
		props.setProperty("cacheResultSetMetadata", "true");
		props.setProperty("cacheServerConfiguration", "true");
		props.setProperty("elideSetAutoCommits", "true");
		props.setProperty("maintainTimeStats", "false");
		
		return props;
		
	}

}
