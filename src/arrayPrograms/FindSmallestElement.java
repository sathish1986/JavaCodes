package arrayPrograms;

public class FindSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {6,8,9,77,3,1};
		
		int min =arr[0];
		
		for (int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println(min);
		//hi
	}

}
