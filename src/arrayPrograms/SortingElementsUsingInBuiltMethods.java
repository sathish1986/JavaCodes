package arrayPrograms;

import java.util.Arrays;

public class SortingElementsUsingInBuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrr[] = {9,6,4,3,1};
		
		for(int i : arrr) {
			System.out.println(i);
		}
		
		Arrays.sort(arrr);
		
		System.out.println(Arrays.toString(arrr));

	}

}
