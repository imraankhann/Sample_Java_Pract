package practice;

public class Remove2ndOccurenceInString {
	 public static void main(String[] args) {
		String str= "I learn java learn";
		String[] c=str.split(" ");
		countwords(str);
		
		
		
		
	}
	 static void countwords(String str){
		 String[] c=str.split(" ");
			for(int i=0;i<c.length;i++){
			for(int j=0;j<c.length;j++){
				if(c[i].equals(c[j])){
					if(i!=j)
						c[i]="";
				}
			}
		}
			
			System.out.println("Removing duplicate words from a given string: ");
			for(int i=0;i<c.length;i++){
				if(c[i]!=""){
					System.out.println(c[i]+" ");
				}
			}
			
	 }

}
