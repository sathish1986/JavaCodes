package arrayPrograms;

public class CopyArrayIntoAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1= new int[]{1,5,6,8,9};
		
		int[] array2=new int[array1.length];
		
		for (int i=0; i<=array1.length;i++) {
			array2[i]=array1[i];
		}
		
		for(int i =0; i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		
	}

}
