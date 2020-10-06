package NumberPrograms;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
		int counter=0;
		
		while(num != 0){
			 num=num/10;
			 ++counter;
		}
		System.out.println(counter);

	}

}
