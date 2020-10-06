package StringPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String name="rotor";
		 
		 String reverse="";
		 
		 int length=name.length();
		 
		 for(int i=length-1;i>=0;i--) {
			 reverse= reverse+name.charAt(i);
		 }
		 System.out.println(reverse);
		 
		 if(reverse.equals(name)) {
			 System.out.println("palidrome");
		 }else {
			 System.out.println("not palidrom");
		 }
		 
		
		
		
		
		

	}

}
