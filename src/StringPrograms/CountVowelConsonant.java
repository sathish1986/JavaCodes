package StringPrograms;

public class CountVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="this is so easy to understand";
		int vCount=0, cCount=0;
        
		String string=name.toLowerCase();
		
		for (int i=0; i<string.length();i++) {
			if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i)=='i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')   {
				vCount++;
			}
			else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
				cCount++;
			}
			
		}
		
		System.out.println("vowels are"+ "  "+ vCount);
		System.out.println("Consonents are " + " " + cCount);
	
	}

}
