package MultilevelInheritance;

public class SonProperties extends FatherProperties{
	
	public void iWatch() {
		System.out.println("This is My Watch");
	}

	public static void main(String[] args) {
		SonProperties son=new SonProperties();
		son.iWatch();
		son.TitanWatch();
		son.GalletWatch();		
	}

}
