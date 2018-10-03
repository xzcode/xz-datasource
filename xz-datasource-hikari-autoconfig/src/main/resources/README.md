/*config example*/

xz:
	datasource:
		hikari: 
			enabled: true
		    jdbcUrl: jdbc:mysql://${server.host}:3306/baoxiao?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false
		    username: root
		    password: 123456
	    	properties:
			    cachePrepStmts: true
			    prepStmtCacheSize: 250
			    prepStmtCacheSqlLimit: 2048
			    useServerPrepStmts: true
			    useLocalSessionState: true
			    useLocalTransactionState: true
			    rewriteBatchedStatements: true
			    cacheResultSetMetadata: true
			    cacheServerConfiguration: true
			    elideSetAutoCommits: true
			    maintainTimeStats: false  
