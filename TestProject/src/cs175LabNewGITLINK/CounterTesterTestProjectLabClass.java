package cs175LabNewGITLINK;

public class CounterTesterTestProjectLabClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//start
				//creates a counter called venue

				Counter venue = new Counter();

				

				//clicks 10 times

				for(int i=1;i<=10;i++) 
				{

					venue.click();

				}

				

				//unclicks 5 times

				for(int i=1;i<=5;i++) 
				{

					venue.unclick();

				}

				

				//prints expected counter value (5)

				System.out.println("Expected: 5");

				

				//prints actual counter value

				int actualValue = venue.getValue();

				System.out.println("Actual: " + actualValue);

				

				//reset counter

				venue.reset();

				

				//click 3 times

				for(int i=1;i<=3;i++) {

					venue.click();

				}

				

				//unclick 4 times

				for(int i=1;i<=4;i++) {

					venue.unclick();

				}

				

				//prints expected counter value (-1)

				System.out.println("Expected: -1");

				

				//prints actual counter value

				actualValue = venue.getValue();

				System.out.println("Actual: " + actualValue);
			}
		}
//finish
//start

		class Counter {

		    private int value;


		     //Gets the current value of this counter.

		    public int getValue()

		    {

		        return value;

		    }

		     // add 1


		    public void click()

		    {

		        value = value + 1;

		    }

		    //subtract 1
		    
		    public void unclick()

		    {

		        value = value -1;

		    }
		    
		    // Resets the value to 0.
		    
		    public void reset()

		    {

		        value = 0;
		        
		    //adding ten
		    }

		    public void clickMany()
		    {
		    	value = value + 10;
		    }
		    
		    //subtracting ten 
		    public void unclickMany()
		    {
		    	value = value - 10;
		    }
		    //finish
		    
		    
				  //start
		    public static void main(String[] args) {
					//creates a counter called anotherVenue
		
					Counter anotherVenue = new Counter();
		
					//clicks 10 times
		
					for(int a=1;a<=10;a++) 
					{
		
						anotherVenue.clickMany();
		
					}
					//unclicks 5 times
		
					for(int a=1;a<=5;a++) 
					{
		
						anotherVenue.unclickMany();
		
					}
		
					
		
					//prints expected counter value (5)
		
					System.out.println("Expected: 5");
		
					
		
					//prints actual counter value
		
					int actualValue = anotherVenue.getValue();
		
					System.out.println("Actual: " + actualValue);
		
					
		
					//reset counter
		
					anotherVenue.reset();
		
					
		
					//click 3 times
		
					for(int a=1;a<=3;a++) 
					{
		
						anotherVenue.clickMany();
		
					}
					//unclick 4 times
		
					for(int a=1;a<=4;a++) 
					{
		
						anotherVenue.unclickMany();
		
					}
	
					//prints expected counter value (-1)
		
					System.out.println("Expected: -1");
		
					//prints actual counter value
		
					actualValue = anotherVenue.getValue();
		
					System.out.println("Actual: " + actualValue);
				}
		//finish
			    	 						
} //class 
