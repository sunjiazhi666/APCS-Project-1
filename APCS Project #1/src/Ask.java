import java.util.ArrayList;
import java.util.Scanner;

public class Ask
	{
		
		
		public static void main(String[] args)
			{
				
				boolean again = true;
				//Ask user want to check or input the new name
				while(again){
				System.out.println("key in student's information press 1");
				System.out.println("check the total students press 2");
				System.out.println("clean all the students press 3");
				System.out.println("To remove the student from the list press 4");
				Scanner userinput1 = new Scanner(System.in);
				String useranswer = userinput1.nextLine();
				
				//Input the information
				if(useranswer.equals("1")){
					System.out.println("Please follow the direction");
					Scanner userinput6 = new Scanner(System.in);															
					
					System.out.println("1.What is your children's name?");
					Scanner userinput3 = new Scanner(System.in);
					String nameinput =  userinput3.nextLine();
					
					System.out.println("2.What is your phonenumber(Parent's)");
					Scanner userinput4 = new Scanner(System.in);
					String parentphonenumber = userinput4.nextLine();
					
					System.out.println("3.Where is your address");
					Scanner userinput5 = new Scanner(System.in);
					String address = userinput5.nextLine();
					
					
					
					DataBase.students.add (new Student (nameinput,parentphonenumber,address));
					System.out.println("Good, your child's information is already in the system");
					}
				
				//total students
				else if(useranswer.equals("2")){
						System.out.println(DataBase.students.size());
					}
					
				//clean all the student
					else if(useranswer.equals("3")){
						System.out.println("Are you sure to clean all the information?");
						System.out.println("Type yes to deleat all the information");
						Scanner userinput2 = new Scanner(System.in);
						String clean = userinput1.nextLine();
						
						if(clean.equals("yes")) {
						DataBase.students.clear();
						System.out.println("The list is clean");
						
					}
					}
						
				//remove student
						else if(useranswer.equals("4")) {
							System.out.println("Please key in your student's name");
							Scanner userinput8 = new Scanner(System.in);
							String deleatname = userinput8.nextLine();
							
							System.out.println("Please key in your phonenumber");
							Scanner userinput11 = new Scanner(System.in);
							String deleatphone = userinput11.nextLine();
							
							System.out.println("Please key in your address");
							Scanner userinput12 = new Scanner(System.in);
							String deleataddress = userinput12.nextLine();
							
							System.out.println("type yes to deleat this student's information");
							Scanner userinput10 = new Scanner(System.in);
							String deleat = userinput10.nextLine();
							if(deleat.equals("yes")) {
								DataBase.students.remove(deleatname);
							}
							
						}
							
					
					
					
				
				
					
					
					//again
					System.out.println("Do you want to key in some other information or check your child's information");
					System.out.println("If you want to back to the start press 1, if you want to exit press 2");
					Scanner userinput8 = new Scanner(System.in);
					String again1 = userinput8.nextLine();
					
					if(again1.equals("1")) {
						again = true;
					}
					
					else if(again1.equals("2")) {
						again = false;
					}
					
					
					
					
					
						
						
				}
						
					}
					
					
					
				}
				
				
				

			

	
