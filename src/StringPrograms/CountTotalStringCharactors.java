package StringPrograms;

public class CountTotalStringCharactors {

	public static void main(String[] args) {    
        String string = "The best of both worlds";    
        int count = 0;       
        int cou=string.length();
        System.out.println(cou);
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        System.out.println("Total number of characters in a string: " + count);    
    }    

}
