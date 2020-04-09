package cs175lab;

public class CounterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates a counter called venue
		Counter venue = new Counter();
		
		//clicks 10 times
		for(int i=1;i<=10;i++) {
			venue.click();
		}
		
		//unclick 5 times
		for(int i=1;i<=5;i++) {
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

		//create a counter called anotherVenue
		Counter anotherVenue = new Counter();
		
		//clickMany 10 times
		anotherVenue.clickMany(10);
		
		//unClickMany 5 times
		anotherVenue.unClickMany(5);
		
		//prints expected counter value (5)
		System.out.println("Expected: 5");
		
		//prints actual counter value
		actualValue = anotherVenue.getValue();
		System.out.println("Actual: " + actualValue);
		
		//reset counter
		anotherVenue.reset();
		
		//clickMany 3 times
		anotherVenue.clickMany(3);
		
		//unClickMany 4 times
		anotherVenue.unClickMany(4);
		
		//prints expected counter value (-1)
		System.out.println("Expected: -1");
		
		//prints actual counter value
		actualValue = anotherVenue.getValue();
		System.out.println("Actual: " + actualValue);
	}
	
}

class Counter {
    private int value;

    /**
     Gets the current value of this counter.
    @return the current value
    */
    public int getValue()
    {
        return value;
    }

    /**
     Advances the value of this counter by 1.
    */
    public void click()
    {
        value = value + 1;
    }
    /**
     Decreases the value of this counter by 1.
    */

    public void unclick()
    {
        value = value -1;
    }

    
    /**
    Advances the value of this counter by however many the user provides in 'timesToClick'.
   */
    public void clickMany(int timesToClick) {
    	value = value + timesToClick;
    }

    /**
    Decreases the value of this counter by however many the user provides in 'timesToUnclick'.
   */
    public void unClickMany(int timesToUnclick) {
    	value = value - timesToUnclick;
    }

    
    /**
     Resets the value of this counter to 0.
    */
    public void reset()
    {
        value = 0;
    }
}


