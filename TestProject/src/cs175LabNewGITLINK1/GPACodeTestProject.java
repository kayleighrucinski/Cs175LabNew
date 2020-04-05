package cs175LabNewGITLINK1;

import java.util.Scanner;

public class GPACodeTestProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		//grades and their values 
		//A = 4.00
		//Aminus = 3.70  
		//Bplus = 3.33 
		//B = 3.00 
		//Bminus = 2.70 
		//Cplus = 2.30 
		//C = 2.00 
		//Cminus = 1.70 
		//Dplus = 1.30  
		//D = 1.00 
		//Dminus = 0.70 

		double decimalGrade = 0.0;

		double gradePoints = 0.0;

		double totalNumberGrade = 0.0;

		int totCreditHours = 0;
		
		double GPA = 0;
		

		String courseInformation = null;
		
		System.out.println("Enter the number of classes you have taken: ");
		String classTot = sc.nextLine();
		int classTot1=Integer.parseInt(classTot);

		
		
		
		for (int i = 1; i <= classTot1; i++ )
		{ //for start
			System.out.print("Enter course information separated by commas "
					+ "(title, credit hours, letter grade) or type Q to quit: ");
			courseInformation = sc.next();
			
			//getting to split user input
			String [] information = courseInformation.split(",");

			String courseInput = information[0];

			int hoursInput = Integer.parseInt(information[1]);

			String letterGrade = information[2];
			
				if(courseInformation.equals("Q")) 
				{ //if start
					break;
				} //if stop

	
				// grade to numeric value 
				if(letterGrade.equals("A")) 
				{ //if start
	
					decimalGrade = 4.0;
	
				} //if stop
	
				else if(letterGrade.equals("A-")) 
				{ // else if start
	
					decimalGrade = 3.7;
	
				}
	
				else if(letterGrade.equals("B+")) 
				{ // else if start
	
					decimalGrade = 3.3;
	
				}
	
				else if(letterGrade.equals("B")) 
				{ // else if start
	
					decimalGrade = 3.0;
	
				}
	
				else if(letterGrade.equals("B-")) 
				{ // else if start
	
					decimalGrade = 2.7;
	
				}
	
				else if(letterGrade.equals("C+")) 
				{ // else if start
	
					decimalGrade = 2.3;
	
				}
	
				else if(letterGrade.equals("C")) 
				{ // else if start
	
					decimalGrade = 2.0;
	
				}
	
				else if(letterGrade.equals("C-")) 
				{ // else if start
	
					decimalGrade = 1.7;
	
				}
	
				else if(letterGrade.equals("D+")) 
				{ // else if start
	
					decimalGrade = 1.3;
	
				}
	
				else if(letterGrade.equals("D")) 
				{ // else if start
	
					decimalGrade = 1.0;
	
				}
	
				else if(letterGrade.equals("D-")) 
				{ // else if start
	
					decimalGrade = 0.7;
	
				}
	
				else if(letterGrade.equals("F") || letterGrade.equals("WF"))  
				{ // else if start
	
					decimalGrade = 0.0;
	
				}
	
				else if(letterGrade.equals("P") || letterGrade.equals("NP") || letterGrade.equals("I"))
				{ // else if start
	
					hoursInput = 0;
	
				} //else stop
	
				else
				{ // else start
	
					break;
	
				} // else stop
	
				gradePoints += (decimalGrade * hoursInput);
	
				totCreditHours += hoursInput;
	
				totalNumberGrade += decimalGrade;
	
	
				System.out.println("Course title: " + courseInput + " | Amount of credit hours: " + hoursInput + " | Your letter grade: " 
						+ letterGrade + " | " + "Total grade points: " + totalNumberGrade);
		}
			
				
			
				GPA = gradePoints / totCreditHours;
				System.out.println("Your total GPA is " + GPA);
			
		} //class
	} //void 
