


    public class RecursionApplication {
	   static  void towerofHanoi (char source_rod, char destination_rod,char auxialry_rod,int n)
	   {
	      if (n == 1){
		         System.out.println("Move disk from"
				       + source_rod
					   + "to"
					   + destination_rod);
					   
		}else{
		
               towerofHanoi(source_rod,auxialry_rod,destination_rod,n-1);		
	           towerofHanoi(source_rod,destination_rod,auxialry_rod,1);		
	           towerofHanoi(auxialry_rod,destination_rod,source_rod,n-1);
	   }
	   
	   }
	   
	   public static void main(String args[])
	   {
	       int noOfDisks = 4;
		   towerofHanoi('A','B','C' , noOfDisks);
		   
	}
}	

