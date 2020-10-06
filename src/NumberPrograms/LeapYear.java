package NumberPrograms;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// divisable by 4 for all of centry year--> ending with 00
		// centry year is leap year when its perfectly divisable by 400
		
		//1900 is not leap year
		
		 int year=1900;
		 boolean leap=false;
		 
		 if(year%4==0){
			 if(year%100==0 ){
				 if(year%400==0){
					 leap=true;
				 } else{
					 leap=false;
				 } 
			 }else{
					 leap=true;
				 }	 
		 }else{
					 leap=false;
				 }
				 
	   if(leap){
		   System.out.println(year + "is leap year");
	   }		
	   
	   else{
		   System.out.println(year + "is not leap year");
	   }
	
	}
		 
		
	}


