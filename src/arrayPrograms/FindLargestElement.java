package arrayPrograms;

public class FindLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {6,8,9,77,3,1};
		
		int max =arr[0];
		
		for (int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
		//hi
	}

}
