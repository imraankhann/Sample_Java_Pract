package DataStructues_Demo;

public class BubbleSortDemo {
	
	public static void main(String[] args) {
		int a[]={5,1,6,2,4,3};
		int temp,i,j;
		for( i=0;i<6;i++){
			int flag=0;
			for( j=0;j<6-i-1;j++){
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
//			if(flag==0){
//				break;
//			}
			System.out.print(a[j]);
		}
		
	}

}
