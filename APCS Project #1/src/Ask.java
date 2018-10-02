import java.util.ArrayList;
import java.util.Scanner;

public class Ask
	{
		
		
		public static void main(String[] args)
			{
				DataBase.fillarray();
				boolean restart = true;
			
				while(restart){
				
				System.out.println("welcome to use the Kenny's data base");
				System.out.println("Please follow the direction");
				System.out.println("Plesase set up a administrator password");
				Scanner userinput12 = new Scanner(System.in);
				String password = userinput12.nextLine();
				System.out.println("Just in case, please set up a question for when you forget the password");
				Scanner userinput13 = new Scanner(System.in);
				String question = userinput13.nextLine();
				System.out.println("nowm key in the answer for that question");
				Scanner userinput14 = new Scanner(System.in);
				String passwordanswer = userinput14.nextLine();
				System.out.println("Good, you are ready to use the database");
				
				
				
				boolean again = true;
				//Ask user want to check or input the new name
				while(again){
				System.out.println("key in student's information press 1");
				System.out.println("check the total students press 2");
				System.out.println("clean all the students press 3");	
				System.out.println("Show all the student press 4");
				System.out.println("If you forget your administrator password press 5");
				
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
				System.out.println("Only the administrator have the access to check this information");
				System.out.println("Please key in the administrator password");
				Scanner userinput15 = new Scanner(System.in);
				String totaladmin = userinput15.nextLine();
				if(totaladmin.equals(password)){
					if(DataBase.students.size() == 1){
						System.out.println("There is only one student in the database");
					}
					else{
						System.out.println("There are " + DataBase.students.size() + " students in the database");
					}
				}
				else{
					System.out.println("Sorry, you don't have the access to this category");
				}
						
					}
					
				//clean all the student
				
					else if(useranswer.equals("3")){
						System.out.println("Only the administrator have the access to check this information");
						System.out.println("Please key in the administrator password");
						Scanner userinput16 = new Scanner(System.in);
						String cleanadmin = userinput16.nextLine();
						if(cleanadmin.equals(password)){
							
						
						System.out.println("Are you sure to clean all the information?");
						System.out.println("Type yes to deleat all the information");
						Scanner userinput2 = new Scanner(System.in);
						String clean = userinput1.nextLine();
						
						if(clean.equals("yes")) {
						DataBase.students.clear();
						System.out.println("The list is clean");
						}
						
						else{
							System.out.println("Sorry, you don't have the access to this category");
						}
					}
					}

				//Show all students
				
						else if(useranswer.equals("4")){
							
							System.out.println("Only the administrator have the access to check this information");
							System.out.println("Please key in the administrator password");
							Scanner userinput17 = new Scanner(System.in);
							String alladmin = userinput17.nextLine();
							
							if(alladmin.equals(password)){
							if(DataBase.students.size() > 0){
							for(int i = 0 ; i < DataBase.students.size() ; i ++){
								System.out.println("Name: " + DataBase.students.get(i).getName() + " " + "Phonenumber: " + DataBase.students.get(i).getPhonenumber() + " " + "Address: " + DataBase.students.get(i).getAddress());
							}
							}
							else{
								System.out.println("There is no student in the database");
							}
							
							
							}
							
							else{
								System.out.println("Sorry, you don't have the access to this category");
							}
						}
				
						else if(useranswer.equals("5")){
							System.out.println("Please answer the following question to reset the password");
							System.out.println(question);
							Scanner userinput18 = new Scanner(System.in);
							String answerquestion = userinput18.nextLine();
							
							if(answerquestion.equals(passwordanswer)){
								System.out.println("Good, the answer is right");
							}
							
							else{
								System.out.println("Sorry, the answer is not right");
							}
							
						}
							

					
					
				
					
					
						
						
				}
						
					}
	}
					
					
				}
				
				
				

			

	
