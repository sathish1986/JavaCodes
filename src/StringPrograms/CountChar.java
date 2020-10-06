package StringPrograms;

public class CountChar {
	
	public static void main(String[] args) {
		String s="seleniumeee";
		char c;
		int count=0;
		
		System.out.println(s.length());
		
		for(int i=0;i<=s.length()-1;i++){
		
			if(s.charAt(i)=='l'){
				count++;
			}			
		}
		System.out.println(count);
	}

}
