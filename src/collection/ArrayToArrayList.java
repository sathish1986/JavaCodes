package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]={"hello", "how", "are", "you"};
		
		ArrayList<String> obj=new ArrayList<>(Arrays.asList(arr));
		
		obj.add("GTian");
		
		for(String i: obj){
			System.out.println(i);
		}

	}

}
