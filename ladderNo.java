package ladderNo;

public class ladderNo {
	static int position=0;
	static int number=0;
	static int new_position=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome ");
		while(position<=100)
			
    	
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
			          if(position>100)
					     {
					        position=position-number;
				            
					     }
			          
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
			        	 position=0; 
			         }
		             break;
		    
		    default:System.out.println("no switch");
		             break;
		             
			}
			     if(position!=100)
			     {
			        
		             System.out.println("you are player on position:"+position);
			     }
		             if(position==100)
		         	{
		         		System.out.println("you arewin");
		         		
		         		break;
		             
		             
		             }
			
		
		     }
		
		//check the position its is greater than 100
		 if(position>100)
		     
		    { 
			    //int counter=0;
			    int choice2=0; //die rolled
		    	//save the position to new position i.e 95 old save to new position=95 
		    	 new_position=position-number; 
		    	 int number_need=new_position-100;
		    	 System.out.println("you are  :"+new_position);
		    	 System.out.println("you are need :"+number_need);
		    	 int choice1=(int)(Math.random()*3)+1;
		    	 System.out.println("you ar get number:"+choice1);
		    	 if(choice1!=number_need ) 
		    	 {
		    	 //roll the dice
		    	  choice2=(int)(Math.random()*3)+1;
		    	  while(choice1==choice2)
		    	  {
		    		  choice2=(int)(Math.random()*3)+1;
		    	 System.out.println("you ar getting number:"+choice2);
		    	 if(number_need==choice2)
		    	  {
		    		  System.out.println("you are win"); 
		    		  System.out.println("you ar getting number:"+choice2);
		    		  break;
		    	  }
		    	 else
		    	
		    		 continue;
		    	 
		    	  
		    	 
		    	  
		    	  
		    	
		    
		    	  }
		    	 }
		    	  
		    			  
}

System.out.println("you are win");



		    }
	}


    