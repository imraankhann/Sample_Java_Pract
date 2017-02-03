package OopsConcepts;

public class StaticDemo {
	
	public static void main(String[] args) {
		int a[]={6,3,37,12,46,5,64,21};
		 	int highest=a[0];
		 	int secondHighest=a[0];
		 	for(int i=0;i<a.length;i++){
		 		if(highest<a[i]){
		 			secondHighest=highest;
		 			highest=a[i];
		 		}
		 		else if(secondHighest<a[i]){
		 			secondHighest=a[i];
		 		}
		 	}
		 	
		 	System.out.println("Second highest is : "+secondHighest);
		 	System.out.println("Highest is : "+highest);
	}

}
