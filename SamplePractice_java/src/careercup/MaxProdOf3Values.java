package careercup;

public class MaxProdOf3Values {
	
	public static void main(String[] args) {
		System.out.println(maxThree(new int[] {1,2,3,4,5,6,7,8,9,}));
		
		
	}
	
	private static int maxThree(int [] a){
		int max=Integer.MAX_VALUE;
		int sMax=Integer.MAX_VALUE;
		int tMax=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length-1;i++){
			if(a[i]>max){
				tMax=sMax;
				sMax=max;
				max=a[i];
				
			}
			else if(a[i]>sMax){
				tMax=sMax;
				sMax=a[i];
			}
			else if(a[i]>tMax){
				tMax=a[i];
			}
			
		}
		System.out.println(String.format("max value %s , second max value %s , and third max value %s:",max,sMax,tMax));
		return max*sMax*tMax;
	}
	
	
	

}
