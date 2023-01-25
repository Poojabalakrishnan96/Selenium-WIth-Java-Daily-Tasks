package SingleInheritance;

public class SonHouse extends FatherHouse{
	public void KTM() {
		System.out.println("This is Son's Bike");
	}
	public void Tesla() {
		System.out.println("This is Son's Car");
	}
	public static void main(String[] args) {
		SonHouse son=new SonHouse();
		son.KTM();
		son.Tesla();
		son.cycle();
		son.Suzuki();
	}
}
