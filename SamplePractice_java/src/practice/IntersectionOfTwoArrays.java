package practice;

import java.util.HashSet;

import org.omg.Messaging.SyncScopeHelper;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
//		int [] a={10,20,30,40,50,40};
//		int [] c={30,40,50,60,70,40};
//		
//		HashSet<Integer>s=new HashSet<Integer>();
//		for(int i=0;i<a.length;i++){
//			for(int j=0;j<c.length;j++){
//				if(a[i]==c[j]);
//				s.add(a[i]);
//			}
//		}
//		System.out.println("Intersection items in arrray is : "+s);
		
		int[] x= {2,5,3,7};
        System.out.println("The first array is " +"  ");
        for(int i=0;i<x.length;i++)
        System.out.print(x[i]+"  ");
        System.out.println("");
        int[] y={5,2,9,0,1};
        System.out.println("The second array is " +"  ");
        for(int j=0;j<y.length;j++)
        System.out.print(y[j]+"  ");
        System.out.println("");
        intersectionArr(x,y);
	}
	
	private static void intersectionArr(int x[],int y[]){
		 int i,j,k,c=0,w;
		int[] z=new int[x.length+y.length];
		for( i=0;i<x.length;i++){
			for( j=0;j<y.length;j++){
				if(x[i]==y[j]){
					z[c]=x[i];
					c++;
				}
				else{
					continue;
				}
			}
			System.out.println("intersection of two arrays is : "+" ");
			for(k=0;k<c;k++){
				System.out.print(" "+z[k]+" ");
			}
		}
		
		System.out.println("    ");
		
	}
	

}
