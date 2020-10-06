package NumberPrograms;

public class FactorialNumber {
	
	// !5= 5*4*3*2*1= 120

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num=3;
		 int fact=1;
		 
		 for (int i=1; i<=num;i++){
			 fact=fact*i;   //1*1=1;   1*2=2 ;2*3=6   
		 }

		 System.out.println(fact);
	}

}
