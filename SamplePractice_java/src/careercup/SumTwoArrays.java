package careercup;

public class SumTwoArrays {
	
	public static void main(String[] args) {
		//sumArr(new int[]{1,2,3,4,5,6}, new int[]{2,3,4,5,6,7,8});
		
		int arr1[]={1,5,8,3};
		int arr2[]={1,4,5,7,8};
		int arr3[]=new int[12];
		int k=0;
		for(int i=0;i<arr1.length;i++){
			int sum=arr1[i]+arr2[i];
			int a=sum;
			if(a>9){
				String s=Integer.toString(a);
				//System.out.println(s);
				for(int j=0;j<s.length();j++){
					arr3[k]=Integer.parseInt(s.substring(j,j+1));
					//System.out.println("arr3 is : "+arr3[k]);
					k++;
				}
			}
			else{
				arr3[k]=sum;
				System.out.println("running else");
				System.out.println(arr3[k]);
				k++;
				
			}
		}
		System.out.println("final output");
		for(int i=0;i<k;i++){
			System.out.println("{ "+arr3[i]+ " }" );
		}
		
	}
	
	
	public static void sumArr(int[] a, int[] k){
	}

}
