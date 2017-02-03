package Interfaces;

public class Immu implements Abc,xyz {
	

	public static void main(String[] args) {
		Immu i= new Immu();
		i.print();
	}

	@Override
	public void print() {
		System.out.println("Method");
		
	}

}
