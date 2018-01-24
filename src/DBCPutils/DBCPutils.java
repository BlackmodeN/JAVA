package DBCPutils;

import org.apache.commons.dbcp.BasicDataSource;

public class DBCPutils {
	//	创建出BasicDataSource对象
	private static BasicDataSource dataSource = new BasicDataSource();
//	创建静态代码块 实现连接池配置
	static {
//		连接数据库的四个最基本信息,通过对象方法SetXXXX设置进来
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mybase");
		dataSource.setPassword("1234");
		dataSource.setUsername("root");
//		对连接池中的连接数量配置(可选)
		
		dataSource.setInitialSize(10);   //初始化连接数量	
		dataSource.setMaxActive(8);  //最大连接数
		dataSource.setMaxIdle(5); // 最大空闲数
		dataSource.setMinIdle(1); // 最小空闲
	}
    
//	定义静态方法,得到BasicSource对象
	public static BasicDataSource getDataSource() {
		return dataSource;
	}
	

}
