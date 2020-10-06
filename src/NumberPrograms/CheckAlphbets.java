package NumberPrograms;

public class CheckAlphbets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char name='1';
		
		if(( name >= 'a' && name<= 'z') || (name >='A' &&  name<='Z' )) {
			System.out.println(name+ " is Alphabets");
		}
		else{
			System.out.println(name  + " is Spl Characters");
		}

	}

}
