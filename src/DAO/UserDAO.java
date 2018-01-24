package DAO;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import DBCPutils.DBCPutils;

public class UserDAO {
	private static QueryRunner qr = new QueryRunner(DBCPutils.getDataSource()) ;

	public static boolean login(String Username,String Password) {
	try {
			String sql = "SELECT UserName FROM login WHERE UserName =?";
			List<Object> list = qr.query(sql, new ColumnListHandler<>(),Username);
			if(list.size()==0) {
				System.out.println("ÕËºÅ²»´æÔÚ");
				return false;}
		    sql = "SELECT * FROM login WHERE UserName =? and PassWords =?";
		    Object [] param = {Username,Password};
		    Object [] L =qr.query(sql,new ArrayHandler(),param);
		    if(L.length==0) {
		    	System.out.println("ÕËºÅ»òÃÜÂë´íÎó");
		        return false;}
		    else {
		    	System.out.println("µÇÂ¼³É¹¦");
		    	return true;}
		    }catch(SQLException ex){
		    	ex.printStackTrace();
		    	throw new RuntimeException("µÇÂ¼Ê§°Ü");
		    		
		    		
		    	}
	}	 	     	    	    	    						
   

	public static boolean register(String Username,String Password) {
	try {	String sql = "SELECT UserName FROM login WHERE UserName =?";
		List<Object> list = qr.query(sql, new ColumnListHandler<>(),Username);
		if(list.size()==0) {
			System.out.println("ÕËºÅÒÑ¾­´æÔÚ!Çë³¢ÊÔ"+Username+"_123");
				return false;
				}
		sql = "INSERT INTO login (UserName,PassWords) VALUE(?,?)";
		Object [] L = {Username,Password};
		qr.update(sql,L);
		System.out.println("×¢²á³É¹¦");
		return true;}
	catch(SQLException ex) {
		ex.printStackTrace();
		throw new RuntimeException("×¢²áÊ§°Ü");
	}
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
	
