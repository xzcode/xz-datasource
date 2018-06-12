/*config example*/

sourcemuch:
	commons:
		datasource:
			druid: 
				enabled: true
				driverClassName: com.mysql.jdbc.Driver
			    url: jdbc:mysql://${server.host}:3306/dbname?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false
			    username: root
			    password: 123456
			    initialSize: 1
			    minIdle: 1
			    maxActive: 10
			    maxWait: 10000
			    # 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
			    timeBetweenEvictionRunsMillis: 60000
			    # 配置一个连接在池中最小生存的时间，单位是毫秒
			    minEvictableIdleTimeMillis: 300000
			    # 空闲时检测
			    testWhileIdle: true
			    # 获取连接验证可用性
			    testOnBorrow: true
			    # 返还连接验证可用性
			    testOnReturn: false
			    # 打开PSCache，并且指定每个连接上PSCache的大小
			    poolPreparedStatements: true
			    maxPoolPreparedStatementPerConnectionSize: 20
			    
			    # 验证连接有效与否的SQL，不同的数据配置不同
			    validationQuery: select 1

