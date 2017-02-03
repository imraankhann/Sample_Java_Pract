package OopsConcepts;

public class ParentChildMain {
	public static void main(String[] args) {
		Parent p=new Child();
		p.show();
		Parent p1=new Parent();
		p1.show();
		System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
		Child c=new Child();
		c.show();
}
}
