package ladderNo;

public class ladderNo {
	static int position=0;
	static int position_player2=0;
	static int number=0;
	static int new_position=0;
	static int counter=0;
	static int counter_player2=0;
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
			          counter++;
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
			         counter++;
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
		    	 counter++;
		    	 if(choice1!=number_need ) 
		    	 {
		    	 //roll the dice
		    	  choice2=(int)(Math.random()*3)+1;
		    	  while(choice1==choice2)
		    	  {
		    		  choice2=(int)(Math.random()*3)+1;
		    	 System.out.println("you ar getting number:"+choice2);
		    	 counter++;
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
System.out.println("you are win and counter is"+counter);

//new player

while(position_player2<=100)
	
	
{
	//System.out.println("Welcome ");
	//System.out.println("Welcome new player");
	

	int choice2=(int)(Math.random()*3)+1;
	//.out.print("enter your choice is"+choice);
	switch (choice2) {
	
    case 1:   System.out.println("here is Ladder");
              
              int number=(int)(Math.random()*6)+1;
	          System.out.println("number you received is"+number);
	          position_player2=position_player2+number;
	          if(position_player2>100)
			     {
			        position_player2=position_player2-number;
		            
			     }
	          counter_player2++;
             break;
    case 2:  System.out.println("here is snake");
              number=(int)(Math.random()*6)+1;
	         System.out.println("number you received is"+number);
	         if(position_player2==0)
	         {
	        	 position_player2=0; 
	         }
	         else
	         {
	        	 position_player2=position_player2-number;
	         }
	         if(position_player2<0)
	         {
	        	 position_player2=0; 
	         }
	         counter_player2++;
             break;
    
    default:System.out.println("no switch");
             break;
             
	}
	     if(position_player2!=100)
	     {
	        
             System.out.println("you are player2  on position:"+position_player2);
	     }
             if(position_player2==100)
         	{
         		System.out.println("you arewin");
         		
         		break;
             
             
             }
	

     }

//check the position its is greater than 100
 if(position_player2>100)
     
    { 
	    //int counter=0;
	    int choice4=0; //die rolled
    	//save the position to new position i.e 95 old save to new position=95 
    	 new_position=position_player2-number; 
    	 int number_need=new_position-100;
    	 System.out.println("you are  :"+new_position);
    	 System.out.println("you are need :"+number_need);
    	 int choice3=(int)(Math.random()*3)+1;
    	 System.out.println("you ar get number:"+choice3);
    	 counter_player2++;
    	 if(choice4!=number_need ) 
    	 {
    	 //roll the dice
    	  choice4=(int)(Math.random()*3)+1;
    	  while(choice3==choice4)
    	  {
    		  choice4=(int)(Math.random()*3)+1;
    	 System.out.println("you ar getting number:"+choice4);
    	 counter_player2++;
    	 if(number_need==choice4)
    	  {
    		  System.out.println("you are win"); 
    		  System.out.println("you ar getting number:"+choice4);
    		  break;
    	  }
    	 else
    	
    		 continue;
    	 
    	  
    	 
    	  
    	  
    	
    
    	  }
    	 }
    	  
    			  
}

System.out.println("you are win player2");
System.out.println("you are  player2 and counter is"+counter_player2);
System.out.println("you are player1 and counter is"+counter);
if(counter<counter_player2)
{
	System.out.println("you are win player1");
}
else
{
	System.out.println("you are win player2");
}
		    }
	}


    