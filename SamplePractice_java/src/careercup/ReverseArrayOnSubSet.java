package careercup;

public class ReverseArrayOnSubSet {
	
	public static void main(String[] args) {
		System.out.println(revArrSS(new int[]{1,2,3,4,5,6,7,8,9}, 3));
	}
	
	private static int[] revArrSS(int[] ar, int n){
		for(int i=0;i<ar.length-1;i+=n){
			int left=i;
			int right=Math.min(i+n-1, ar.length-1);
			
			while(left<right){
				int temp=ar[left];
				ar[left]=ar[right];
				ar[right]=temp;
				left++;
				right++;
				
			}
		}
		return ar;
		
	}

}
