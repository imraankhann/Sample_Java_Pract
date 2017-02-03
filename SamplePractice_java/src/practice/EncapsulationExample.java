package practice;

public class EncapsulationExample {
	
	//Encapsulation is a process binding or wrapping data and code that operates on data  into a single entity. This keeps data safe from outside 
	// interface and misuse.
	private String name;
	private String idNum;
	private int age;
	
	public int getAge(){
		return age;
		
	}
	public String getName()
	{
		return name;
	}
	
	public String getIdNum(){
		return idNum;
	}
	
	public  void setAge(int newAge){
		age=newAge;
	}
	public  void setName(String newName){
		name=newName;
	}
	
	public void setIdNum(String newIdNum){
		idNum=newIdNum;
	}
	public static void main(String[] args) {
		
		
		
	}

}
