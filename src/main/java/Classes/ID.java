package Classes;

import java.util.*;
public class ID {
	
	public String idNum;
	protected String fullName;
	private String address;
	
		protected ID(String intNum, String fullName, String address){
			this.idNum = intNum;
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
		
	public String getAddress() {
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

	public static ID createNewID(String fullName, String address, String IDNum) {
			ID id= null;
				String fullN = fullName;
				String add = address;
				String newIDNum = IDNum;
		 id = new ID(newIDNum, fullN, add);
		
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((idNum == null) ? 0 : idNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ID other = (ID) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (idNum == null) {
			if (other.idNum != null)
				return false;
		} else if (!idNum.equals(other.idNum))
			return false;
		return true;
	}
	
}
