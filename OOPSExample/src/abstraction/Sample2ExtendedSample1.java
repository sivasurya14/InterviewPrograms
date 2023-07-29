package abstraction;

public class Sample2ExtendedSample1 extends Sample1{

	@Override
	protected void display() {
		System.out.println("hello World...");
		
	}
	
	public static void main(String[] args) {
		Sample2ExtendedSample1 c= new Sample2ExtendedSample1();
		
		c.display();
	}

}
