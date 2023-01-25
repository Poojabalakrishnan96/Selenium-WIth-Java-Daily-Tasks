package HierarchicalInhertance;

public class SonAsserts extends FatherAsserts{
	
	public void ninjaBike() {
		System.out.println("This is Son's Ninja Bike");
	}
	public static void main(String[] args) {
		SonAsserts son=new SonAsserts();
		DaughterAsserts d=new DaughterAsserts();
		d.scootyPeps();
		son.ninjaBike();
		son.BullotBike();
		son.HondaXl();
	}

}
