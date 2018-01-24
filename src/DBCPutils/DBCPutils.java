package DBCPutils;

import org.apache.commons.dbcp.BasicDataSource;

public class DBCPutils {
	//	������BasicDataSource����
	private static BasicDataSource dataSource = new BasicDataSource();
//	������̬����� ʵ�����ӳ�����
	static {
//		�������ݿ���ĸ��������Ϣ,ͨ�����󷽷�SetXXXX���ý���
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mybase");
		dataSource.setPassword("1234");
		dataSource.setUsername("root");
//		�����ӳ��е�������������(��ѡ)
		
		dataSource.setInitialSize(10);   //��ʼ����������	
		dataSource.setMaxActive(8);  //���������
		dataSource.setMaxIdle(5); // ��������
		dataSource.setMinIdle(1); // ��С����
	}
    
//	���徲̬����,�õ�BasicSource����
	public static BasicDataSource getDataSource() {
		return dataSource;
	}
	

}
