package practice;

public class DuplicateNumInArray {
	public static void main(String[] args) {
		int [] a={10,20,30,40,20,50,50};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println("Duplicate is : "+a[i]);
					a[i]=0;
					System.out.println("after removal of duplicate array is "+a[i]);
				}
			}
				
		}
	}

}
