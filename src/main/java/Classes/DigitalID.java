package Classes;

import java.util.Scanner;
import java.util.*;

public class DigitalID extends ID{
	
	
	private int socialCreditScore;
	protected String cryptoAssets;
	public String walletAddress;
	
	DigitalID(ID idObject,int socialCreditScore, String cryptoAssets, String walletAddress) {
		super(idObject.idNum,idObject.fullName, idObject.getAddress());
			this.socialCreditScore = socialCreditScore;
			this.cryptoAssets = cryptoAssets;
			this.walletAddress = walletAddress;
	}
	
	public static DigitalID createNewID(ID analogID) {
		DigitalID id= null;
		
		Scanner scan = new Scanner(System.in);
			System.out.println("What is the name of your Crypto Assests");
				String cryptoAsset = scan.nextLine();
			System.out.println("Enter Your Wallet Address");
				String walletAdd = scan.nextLine();
				int SCS = createSocialCreditScore();
			System.out.println("Your new Social Credit Score number is "+SCS);
			 id = new DigitalID(analogID, SCS, cryptoAsset, walletAdd);
		
		return id;
	}
	
	private static int createSocialCreditScore() {
		Random r = new Random();
		int low = 300;
		int high = 800;
		int result = r.nextInt(high-low) + low;
		
		return result;
	}
	
	protected int getSocialCreditScore() {
		return socialCreditScore;
	}

	@Override
	public String toString() {
		return "DigitalID [socialCreditScore=" + socialCreditScore + ", cryptoAssets=" + cryptoAssets
				+ ", walletAddress=" + walletAddress + ", idNum=" + idNum.toString() + ", fullName=" + fullName + "]";
	}
	
	

}
