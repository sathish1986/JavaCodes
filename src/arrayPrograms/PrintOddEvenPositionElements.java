package arrayPrograms;

public class PrintOddEvenPositionElements {

	public static void main(String[] args) {
    int arr[] = {1,4,7,9,10};
   
     oddPosition(arr);
     evenPosition(arr);

     
	}
    
    static void oddPosition(int[] arr) {
    	
 
        for (int i=0; i<arr.length; i=i+2) {
        	System.out.println(arr[i]);
        }		
	}
    
   

    static void evenPosition(int[] arr) {
        for (int i=1; i<arr.length; i=i+2) {
        	System.out.println(arr[i]);
        }
 

}}
