package practice;

import java.util.Comparator;

public class ComprImpl implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1%10<o2%10){
			return 1;
		}
		else{
		return -1;
		}
	}

}
