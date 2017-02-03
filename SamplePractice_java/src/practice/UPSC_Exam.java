package practice;

public class UPSC_Exam {
	
	int i;
	public UPSC_Exam() {
		System.out.println("First COnstructor");
	}
	
	UPSC_Exam(int j){
		this();
		System.out.println("Second constructor");
	}
	void methodone(){
		System.out.println("from method one");
	}
	void methodtwo(){
		System.out.println(this.i);
		System.out.println("From method two");
		this.methodone();
	}
	public static void main(String[] args) {
		//UPSC_Exam ue=new UPSC_Exam();
		UPSC_Exam ue1=new UPSC_Exam(10);
		ue1.methodone();
	}
	

}
