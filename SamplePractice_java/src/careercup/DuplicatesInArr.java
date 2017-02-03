package careercup;

public class DuplicatesInArr {
	
	public static void main(String[] args) {
		System.out.println(countDup());
		
		
	}
	
	private static int countDup(){
		String[] arr={"abc","def","xyz","ghi","abc","def","xyz"};
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].equals(arr[j]) &&i!=j){
					count++;
					System.out.println("Duplicate is : "+arr[i]+" and count is : "+count);
				}
			}
		}
		return count;
	}
}

