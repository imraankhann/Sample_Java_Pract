package StringsExamples;

public class DuplicateInArray {
	public static void main(String[] args) {
		String [] strArry={"One","Two","Three","Four","Five","Six","Five"};
		
		for(int i=0;i<strArry.length-1;i++ ){
			for(int j=i+1;j<strArry.length;j++){
				if(strArry[i].equals(strArry[j]) &&(i!=j)){
					System.out.println("Dupl is : "+strArry[j]);
				}
				
			}
		}
		
		
	}

}
