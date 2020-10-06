package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class streamFilterAPITest {

	public static void main(String[] args)	
	{

		List<String > li= new ArrayList<String>();
		li.add("Ahkil");
		li.add("how");
		li.add("Aazghu");
		
	Long c=	li.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	
		
    // ANother way t create 		
	long d=	Stream.of("Ahkil","hi","Aazghu").filter(s->
		{
		s.startsWith("A");
		return true;
		}).count();
	
	System.out.println(d);
	
	// iterate arraylist using stream
	
	//li.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
	li.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));

	}
	
	


}