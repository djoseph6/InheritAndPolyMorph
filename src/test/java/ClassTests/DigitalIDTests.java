package ClassTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Classes.DigitalID;
import Classes.ID;

public class DigitalIDTests {
	
	ID mockID1;
	DigitalID mockDigitalID;
	
	@BeforeClass
	public void createMockIDs() {
		ID id1 = ID.createNewID("Daniel", "226", "1234-45AC");
		
			if(id1 != null) {
			mockID1 = id1;
			DigitalID dID = DigitalID.createNewID(id1, "BTC", "ZYX0000", 20);
				if(dID != null) {
					mockDigitalID = dID;
				}
			}
		}
	@Test	
	public void createNewDigitalIDValid() {
		ID id2 = ID.createNewID("Samuel", "622", "4321-45AC");
		if(id2 != null) {
			DigitalID dID = DigitalID.createNewID(id2, "BTC", "ZYX0000", 20);
				if(dID != null)
					Assert.assertNotEquals(id2, dID);
					
		}else {
			Assert.fail();
		}
	}
	
	@Test
	public void getSocialCreditScoreValid() {
		
		if(mockID1 != null) {
			DigitalID dID = DigitalID.createNewID(mockID1, "BTC", "ZYX0000", 20);
				if(dID != null) 
					Assert.assertEquals(dID.getSocialCreditScore(), mockDigitalID.getSocialCreditScore());
		}
	}
	
	@AfterClass
	public void cleanUp() {
		mockID1 = null;
		mockDigitalID = null;
	}
	
}
