package phaniJavaTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Employee {
	
	private String firstName; 
	private String lastName;
	private  int age;
	private  int phone;
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}

   public String toString() {
	return firstName + " " + lastName +" " + age +" " + phone;
	   
   }
	
	
	public static void main(String[] args) throws IOException {
		
		Employee emp=new Employee();		
		System.out.println(emp);
		
		List<String> list =Files.readAllLines(Paths.get("F:\\NonGTSession\\Java_Programs\\src\\phaniJavaTask\\employee.txt"));
		
		for(String li: list ) {
			String[]  sp  =li.split(",");
			for(String s:sp) {
				System.out.println(s);
			}
		
		}
		
		
		
		
		
	}

}
