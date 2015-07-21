
public class EnhancedForLoop {
	
	public static int [] numbers = {10, 20, 30, 40, 50};

		   public static void main(String args[]){
		      //int [] numbers = {10, 20, 30, 40, 50};
		      numbers[0] = 10;
		      numbers[1] = 20;
		      numbers[4] = 50;
		    
		      // Old for loop 
		      
		      for(int i = 0; i <numbers.length; i ++) {
		    	  System.out.print( "Old For loop " +numbers[i] +"\n" );
		    	  
		      }
		      
		      // New for loop
		      for(int i : numbers) {
		    	  System.out.println("New For Loop "+i);
		    	  
		      }
		     
		      System.out.print("\n");
		      String [] names ={"James", "Larry", "Tom", "Lacy"};
		      for( String name : names ) {
		         System.out.print( name );
		        System.out.print("\n");
		      }
		   }
		


}
