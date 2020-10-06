package NumberPrograms;

public class PrintMultiplyWithoutJavaOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int mul=multiply(5, 10);
		 System.out.println(mul);

	}
	static int multiply(int x, int y){
		
		int k=1;
		int sum=0;
		while(k<=y){
			sum=sum+x;
			k++;
		}
		return sum;
	}

}
