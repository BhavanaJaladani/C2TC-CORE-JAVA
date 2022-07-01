package Datatypes;

public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for loop
		  for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
		  }
		  // while loop 
		  int i=1,j=1;
		  while(i<10 || j<10)
		  { 
			  i++; j++;
		      System.out.println("i="+i+" and j="+j); 
		  }	
		
		// Do while loop
		 
			do {
				i++;
				j++;
				System.out.println("i=" + i + " and j=" + j);
		    } while (i < 10 || j < 10);
	}


}

