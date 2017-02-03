package practice;

import java.util.Arrays;

public class ZeroesAndOnesInArray {
	
	public static void main(String[] args) {
		int[] a={1,0,1,0,0,0,1,1,1,0,1,0};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		
		StringBuffer bf1 =new StringBuffer();
		StringBuffer bf2 =new StringBuffer();
		
		for (int i : a) {
			if(i==1){
				bf1.append(i);
			}else{
				bf2.append(i);
			}
			
		}
		System.out.println(bf2.append(bf1));
		
		
//		for(int num:a){
//			System.out.print("Given array is : "+num);
//		Arrays.sort(a);
//		}
//		System.out.println("After sorting array is : ");
//		for(int num:a){
//		System.out.print(num);
//		}
		
    	
		 
	//	assembleZerosAndOnes(new int[] {1,0,1,0,0,0,1,1,1,0,1,0});
		
	}
	
	private static void assembleZerosAndOnes(int[] a){
//		int counter=0;
//		for(int i=0;i<a.length;i++){
//			if(a[i]!=0){
//				a[counter]=a[i];
//			}
//		}
//		while(counter<a.length){
//			a[counter]=0;
//		}
//		System.out.println(Arrays.toString(a));
//	}
		
		
		
	}
}
