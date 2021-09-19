package ladderNo;

public class ladderNo {
	static int position=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome ");
		
		{
			//System.out.println("Welcome ");
			//System.out.println("Welcome new player");
			

			int choice=(int)(Math.random()*3)+1;
			//.out.print("enter your choice is"+choice);
			switch (choice) {
			
		    case 1:   System.out.println("here is Ladder");
		              
		              int number=(int)(Math.random()*6)+1;
			          System.out.println("number you received is"+number);
			          position=position+number;
			          
		             break;
		    case 2:  System.out.println("here is snake");
		              number=(int)(Math.random()*6)+1;
			         System.out.println("number you received is"+number);
			         if(position==0)
			         {
			        	 position=0; 
			         }
			         else
			         {
			        	 position=position-number;
			         }
			         if(position<0)
			         {
			        	 position=1; 
			         }
		             break;
		    
		    default:System.out.println("no switch");
		             break;
		             
		             
		             
		             }
		
		     }
}
}
