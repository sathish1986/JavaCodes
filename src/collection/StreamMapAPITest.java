package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name1= new ArrayList<String>();
		name1.add("How");
		name1.add("are");
		name1.add("you");
		
		
		// print names which have last letter as "a" with upper case
		//Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())		
		 Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		 
		 
		 
		 // Sorting elements 
		 List<String> names= Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rama");		 
		 names.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));		   
		   System.out.println("------");		 
		 names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));		 
		 		 
		 // merging or concantating 2 different list into one stream
		 System.out.println("--- concantating stream---"); 
		 Stream<String> newStream=Stream.concat(name1.stream(), names.stream());
		// newStream.sorted().forEach(s->System.out.println(s));
		 
		 // Anymatch method which return boolean to
		 System.out.println("--- anyMatch method---"); 
		boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("Ad1am"));
		  System.out.println(flag);
		 

	}

}
