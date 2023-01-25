package HierarchicalInhertance;

public class DaughterAsserts extends FatherAsserts{
	public void scootyPeps() {
		System.out.println("This is Daughter's Scooty");
	}
	public static void main(String[] args) {
		DaughterAsserts daughter=new DaughterAsserts();
		SonAsserts s=new SonAsserts();
		s.ninjaBike();
		daughter.scootyPeps();
		daughter.BullotBike();
		daughter.HondaXl();
	}
}
