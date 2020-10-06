package arrayPrograms;

public class SortingDescendingOrderElementsUsingLoops {
	public static void main(String[] args) {
		
		// Ascending order
		int arr[] = {1,6,19,11,2};
		int temp=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp=arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
					
				}
			}
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}

}
