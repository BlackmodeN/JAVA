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
				System.out.println("û���������");
			break;
							
			
			
			}
			
			
		}
	}

	
	private static String chooser() {
			System.out.println("��ӭ!");
			System.out.println("��1��¼,��2ע��,��3�˳�!! \n");
		return	in.next();
		
		 
	}
	
	
	

}
