package StringPrograms;

public class RemovalAllOccuranceofGivenCharactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "abcdABCDabcdABCD";
		
		str1 = str1.replace("a", ""); 

		System.out.println(str1); // bcdABCDbcdABCD
	}

}
