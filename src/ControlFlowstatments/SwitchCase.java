package ControlFlowstatments;

public class SwitchCase {

	
	//  if we know the inputs, can use switch case
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		grading('3');
	}
	
	static void grading(char grade){
		
		switch(grade){
		
		case 'A':
			System.out.println("Excellent");
			break;
			
		case 'B':
			System.out.println("Very good");
			break;
			
		case 'C':
			System.out.println("good");
			break;
		case 'D':
			System.out.println("bad");
			break;
			
		default:
			System.out.println("invaid input");
			break;
		}
		
		
	}

}
