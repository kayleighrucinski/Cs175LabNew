package cs175LabNew;

import java.util.Scanner;

public class HeatIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				
				double HeatInd = 0;
				double RelHeat = 0;
				double Temp = 0;
				double i = 0;
				double TempInput = 0;
				double HumidityInput = 0;
				double Calculate = 0;
				
				
				HeatInd = -42.379 + 2.04901523*Temp + 10.14333127*RelHeat - .22475541*Temp*RelHeat - .00683783*Temp*Temp - .05481717*RelHeat*RelHeat
						+ .00122874*Temp*Temp*RelHeat + .00085282*Temp*RelHeat*RelHeat - .00000199*Temp*Temp*RelHeat*RelHeat;
				System.out.printf("     ");
				for (i = 80; i<=110; i+=2)
					System.out.printf("Temperature (F)");
				{
					System.out.printf("%5.0f", i);
				}
				System.out.println();
				System.out.println("_______________________________________________________________________________________");
				for (RelHeat = 40; RelHeat <= 100; RelHeat+=5) //this is the Y axis 
				{
					System.out.printf("%4.0f |", RelHeat);
					System.out.printf("Relative Humidity");
					for (Temp = 80; Temp <= 110; Temp+=2)
						
					{
						HeatInd =  -42.379 + 2.04901523* Temp + 10.14333127* RelHeat - .22475541*Temp*RelHeat - .00683783*Temp*Temp - .05481717*RelHeat*RelHeat + .00122874*Temp*Temp*RelHeat + .00085282*Temp*RelHeat*RelHeat - .00000199*Temp*Temp*RelHeat*RelHeat;
						//print the spaces 
			

						if (HeatInd > 137)
						{
						
						System.out.printf("");
						}
						else 
						{
							System.out.printf("%5.0f", HeatInd);	
						}
					}
					System.out.println(); 
				}

				
				//after chart questions 
				while ((TempInput == 0) && (HumidityInput == 0))
				  {
				System.out.println("Please enter a temperature or 0 to quit: ");
				TempInput = sc.nextDouble();
					 System.out.println("You have ended the program!");
					 break;
				  }
				System.out.println("Please enter a temperature or 0 to quit: ");
				TempInput = sc.nextDouble(); 
				System.out.println("Please enter a humidity: ");
				HumidityInput = sc.nextDouble();
				
				
				  
			
				Calculate = -42.379 + 2.04901523* TempInput + 10.14333127* HumidityInput - .22475541*TempInput*HumidityInput - .00683783*TempInput*TempInput - .05481717*HumidityInput*HumidityInput + .00122874*TempInput*TempInput*HumidityInput + .00085282*TempInput*HumidityInput*HumidityInput - .00000199*TempInput*TempInput*HumidityInput*HumidityInput;
				
				
				//after chart answers 
				if (Calculate < 90)
					//The THI for a temperature of 90 and relative of 70 is: 105 Advisory: Danger
					{
					System.out.println("The THI for a temperature of " + TempInput + " and relative of " + HumidityInput + " is: " + Calculate + " Advisory: Caution");
					}
				else if (Calculate < 105)
					{
					System.out.println("The THI for a temperature of " + TempInput + " and relative of " + HumidityInput + " is: " + Calculate + " Advisory: Extreme Caution");
					}
				else if (Calculate < 126)
					{
					System.out.println("The THI for a temperature of " + TempInput + " and relative of " + HumidityInput + " is: " + Calculate + " Advisory: Danger");	
					}
				else 
					{
					System.out.println("The THI for a temperature of " + TempInput + " and relative of " + HumidityInput + " is: " + Calculate + " Advisory: Extreme Caution");
					}
				
			
			
			} //void 

		} //class 
