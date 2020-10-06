package NumberPrograms;

import java.util.Scanner;

  // odd, 1,3,5,,7,9,11,13,15,17,19
  //Even 2,4,6,8,10, 12,14

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader= new Scanner(System.in);
		System.out.println("Please enter your number to check Odd or Even number");
		int num=reader.nextInt();
	
	  if(num%2==0){
		System.out.println("its even number");
	}
	else{
		System.out.println("its Odd numbers");
	}

	}

}
