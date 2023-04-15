package Classes;

import java.util.*;
public class ID {
	
	public String idNum;
	protected String fullName;
	private String address;
	
		protected ID(String intNum, String fullName, String address){
			this.idNum = idNum;
			this.fullName = fullName;
			this.address = address;
		}
		
	public static ID createNewID() {
		ID id= null;
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter Full Name");
				String fullN = scan.nextLine();
			System.out.println("Enter Your Address");
				String add = scan.nextLine();
				String newIDNum = createRandomIDNum();
			System.out.println("Your new ID number is "+newIDNum);
			 id = new ID(newIDNum, fullN, add);
		
		return id;
	}
		
	protected String getAddress() {
		return this.address;
	}
	
	private static String createRandomIDNum() {
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder((100000 + rnd.nextInt(900000)) + "-");
		for (int i = 0; i < 5; i++)
		    sb.append(chars[rnd.nextInt(chars.length)]);

		return sb.toString();
	}
}
