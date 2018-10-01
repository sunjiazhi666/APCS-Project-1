import java.util.ArrayList;
import java.util.Scanner;

public class Ask
	{
		
		
		public static void main(String[] args)
			{
				
				boolean again = true;
				//Ask user want to check or input the new name
				while(again){
				System.out.println("Do you want to check or key in the information?");
				System.out.println("If you wan to check press 1");
				System.out.println("If you want to input press 2");
				Scanner userinput1 = new Scanner(System.in);
				String useranswer = userinput1.nextLine();
				
				
				if(useranswer.equals("1")){
					System.out.println("Do you want to check the information or total students");
					System.out.println("If you want to check the information press 1");
					System.out.println("If you want to check the total students press 2");
					Scanner userinput2 = new Scanner(System.in);
					String answer = userinput2.nextLine();
					
					if(answer.equals("2")){
						System.out.println(DataBase.students.size());
					}
					
					else if(answer.equals("1")){
						System.out.println("Please follow the direction");
						System.out.println("Please key in student's name");
						Scanner userinput7 = new Scanner(System.in);
						String studentname1 = userinput7.nextLine();
					}
							
					
					
					
				}
				
				//Key in the information
				else if(useranswer.equals("2")){
					System.out.println("Please follow the direction");
					Scanner userinput6 = new Scanner(System.in);
					
					
					
					
					System.out.println("Please follow the direction");
					System.out.println("1.What is your children's name?");
					Scanner userinput3 = new Scanner(System.in);
					String nameinput =  userinput3.nextLine();
					
					System.out.println("2.What is your phonenumber(Parent's)");
					Scanner userinput4 = new Scanner(System.in);
					String parentphonenumber = userinput4.nextLine();
					
					System.out.println("3.Where is your address");
					Scanner userinput5 = new Scanner(System.in);
					String address = userinput5.nextLine();
					
					// Put the information into the Array list
					
					DataBase.students.add (new Student (nameinput,parentphonenumber,address));
					}
					
					System.out.println("Do you want to do again?");
					System.out.println();
						
						
				}
						
					}
					
					
					
				}
				
				
				

			

	
