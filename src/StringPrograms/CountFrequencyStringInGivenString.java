package StringPrograms;

public class CountFrequencyStringInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String str = "picture perfect";    
	        int[] freq = new int[str.length()];    
	        int i, j;    
	            
	        //Converts given string into character array    
	        String[] stri = str.split(" ");    
	            
	        for(i = 0; i <str.length(); i++) {    
	            freq[i] = 1;    
	            for(j = i+1; j <str.length(); j++) {    
	                if(stri[i] == stri[j]) {    
	                    freq[i]++;    
	                        
	                    //Set string[j] to 0 to avoid printing visited character    
	                  //  stri[j] = '0';    
	                }    
	            }    
	        }    
	            
	        //Displays the each character and their corresponding frequency    
	        System.out.println("Characters and their corresponding frequencies");    
	        for(i = 0; i <freq.length; i++) {    
	            if(stri[i] = ' ' != null)    
	                System.out.println(stri[i] + "-" + freq[i]);    
	        }    
	    }   

	}
	
