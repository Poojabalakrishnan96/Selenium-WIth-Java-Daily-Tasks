package MultipleInheritance;

public class Derived implements Inter1,Inter2 {
	public void fun1()
	{
		System.out.println("Inter1= "+a);
	}
	public void fun2()
	{
		System.out.println("Inter2= "+b);
	}

	public static void main(String[] args) {
		Derived value=new Derived();
		value.fun1();
		value.fun2();

	}

}
