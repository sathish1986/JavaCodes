package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaExperssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String > li= new ArrayList<String>();
		li.add("hi");
		li.add("how");
		
		/*Iterator<String> i=li.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/

		li.forEach(System.out::print); 
		
	}

}
