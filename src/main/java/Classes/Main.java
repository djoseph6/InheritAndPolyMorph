package Classes;

public class Main {

	public static void main(String[] args) {
		ID newID = ID.createNewID();
		DigitalID me = DigitalID.createNewID(newID);
		System.out.println(me.toString());

	}

}
