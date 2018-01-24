package UserUI;

import java.util.Scanner;

import DAO.UserDAO;

public class UserUI {
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		while( true) {
			switch(chooser()) {
			case "1":
				String Username = in.next();
				String Password = in.next();
				UserDAO.login(Username, Password);
				
				
			break;
		
			case "2":
				 Username = in.next();
				 Password = in.next();
				 UserDAO.register(Username, Password);
			break;
			case"3":
				System.exit(0);
			break;
			default:
				System.out.println("没有这个功能");
			break;
							
			
			
			}
			
			
		}
	}

	
	private static String chooser() {
			System.out.println("欢迎!");
			System.out.println("扣1登录,扣2注册,扣3退出!! \n");
		return	in.next();
		
		 
	}
	
	
	

}
