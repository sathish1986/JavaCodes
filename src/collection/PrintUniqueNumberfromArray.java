package collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUniqueNumberfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> values=Arrays.asList(3,2,5,3,7,4,5);
	
	values.stream().distinct().forEach(s->System.out.println(s)) ;
	List<Integer> newt= values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(newt.get(2));
	 
	}

}
