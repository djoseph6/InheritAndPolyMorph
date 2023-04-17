package ClassTests;

import Classes.ID;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;
public class IDtests{
	

	private static ID mockID;
	
	@BeforeClass
	public static void mockIDObject(){
		 mockID = ID.createNewID("Daniel","226","1234-4AD3");
	}
	
	@Test
	public void creatingNewIDValid() {
		ID id = ID.createNewID("Daniel","226","1234-4AD3");
		Assert.assertEquals(id, mockID);
	}
	
	@Test
	public void getAddressValid() {
	String mockAdd = mockID.getAddress();
	ID id = ID.createNewID("Daniel","226","1234-4AD3");
	String idAdd = id.getAddress();
	
	Assert.assertEquals(idAdd, mockAdd);
	}
	
	@AfterClass
	public static void endMocks() {
		mockID = null;
	}
	

}
