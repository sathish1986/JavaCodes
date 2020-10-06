package arrayPrograms;

public class RemoveDuplicatElemetnsAndSort {

	public static void main(String[] args) {

		int arr[] = {1,2,2,5,7,7};
		
		 int count=arr.length;
			/*
			 * if (count==0 || count==1){
			 * 
			 * }
			 */		
        int[] temp = new int[count];  
        int j = 0;  
        for (int i=0; i<count-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[count-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        } 
        
        for (int o: arr) {
        	System.out.println(0);
        }
         
    }  
		
		
		
	}


