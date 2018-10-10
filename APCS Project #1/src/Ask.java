import java.util.ArrayList;

import java.util.Scanner;

public class Ask
	{
		
		
		public static void main(String[] args)
			{
				DataBase.fillarray();
				boolean restart = true;
				while(restart){
				
			System.out.println("Welcome to Kenny's data base");
			System.out.println("");
			System.out.println("Please follow the direction");
			System.out.println("");
			System.out.println("Please set up an administrator password");
			Scanner userinput12 = new Scanner(System.in);
			String password = userinput12.nextLine();
			System.out.println("Just in case, please set up a question for when you forget the password");
			Scanner userinput13 = new Scanner(System.in);
			String question = userinput13.nextLine();
			System.out.println("");
			System.out.println("Now key in the answer for that question");
			Scanner userinput14 = new Scanner(System.in);
			String passwordanswer = userinput14.nextLine();
			System.out.println("Good, you are ready to use the database");	
			boolean again = true;
				
				//Ask user want to check or input the new name
				while(again){
				System.out.println("");
				System.out.println("Key in student's information press 1");
				System.out.println("Go to administrator menu press 2");
				System.out.println("Check your student's information press 3");
				System.out.println("Deleat your student press 4");
				
				Scanner userinput1 = new Scanner(System.in);
				String useranswer = userinput1.nextLine();
				
				//Input the information
					if(useranswer.equals("1")){
					System.out.println("Please follow the direction");
					Scanner userinput6 = new Scanner(System.in);																		
					System.out.println("1.What is your child's name?");
					Scanner userinput3 = new Scanner(System.in);
					String nameinput =  userinput3.nextLine();				
					System.out.println("2.What is your phonenumber(Parent's)");
					Scanner userinput4 = new Scanner(System.in);
					String parentphonenumber = userinput4.nextLine();
					System.out.println("3.What is your address");
					Scanner userinput5 = new Scanner(System.in);
					String address = userinput5.nextLine();
					System.out.println("What is your student's birthday?");
					Scanner userinput19 = new Scanner(System.in);
					String birthdayinput = userinput19.nextLine();
					DataBase.students.add (new Student (nameinput,parentphonenumber,address,birthdayinput));
					System.out.println("Good, your child's information is already in the system");
					}
			
					
					
							else if(useranswer.equals("2")){
							System.out.println("Please key in the administrator password. If you forget, please type forget");
							Scanner userinput21 = new Scanner(System.in);
							String totaladmin = userinput21.nextLine();
							if(totaladmin.equals(password)){
							System.out.println("Good, your password is right");
							System.out.println("");
							System.out.println("Check the total students press 1");
							System.out.println("Remove all the students press 2");	
							System.out.println("Show all the student press 3");
							Scanner userinput20 = new Scanner(System.in);
							String answer1 = userinput20.nextLine();
						
						//Total student
								if(answer1.equals("1")){
								if(DataBase.students.size() == 1){
								System.out.println("There is only one student in the database");
							}
								else if(DataBase.students.size()==0){
									System.out.println("There is no student in the database");
								}
								
								else{
								System.out.println("There are " + DataBase.students.size() + " students in the database");
							}
							
					}
								
								
						//Clean all the student
									else if(answer1.equals("2")){
									System.out.println("Are you sure you want to clear all the information?");
									System.out.println("Type yes to delete all the information");
									Scanner userinput2 = new Scanner(System.in);
									String clean = userinput1.nextLine();
									if(clean.equals("yes")) {
									DataBase.students.clear();
									System.out.println("");
									System.out.println("The system has been cleared");
							}
						}
						
						
						//show all students
										else if(answer1.equals("3")){
										if(DataBase.students.size() > 0){
										for(int i = 0; i < DataBase.students.size(); i ++){
										System.out.println("Name: " + DataBase.students.get(i).getName() + " " + "Phonenumber: " + DataBase.students.get(i).getPhonenumber() + " " + "Address: " + DataBase.students.get(i).getAddress() + " " + "Birthday: " + DataBase.students.get(i).getBirthday());
								}
								}
										else{
										System.out.println("There is no student in the database");
								}
						}
					}
					
							
					//Forget password
					else if(totaladmin.equals("forget")){
						System.out.println("Please answer the following question to reset the password");
						System.out.println(question);
						Scanner userinput18 = new Scanner(System.in);
						String answerquestion = userinput18.nextLine();
						
						if(answerquestion.equals(passwordanswer)){
							System.out.println("Good, the answer is right");
							System.out.println("");
							System.out.println("Password has been reset");
							System.out.println("");
							again = false;
							
						}
						
						else{
							System.out.println("Sorry, the answer is not right");
							
							
						}
						
					}
					
					else{
						System.out.println("Sorry, your password is wrong.");
					}
						
					}
					//No 3
							else if(useranswer.equals("3")){
								System.out.println("What is your student's name");
								Scanner userinput20 = new Scanner(System.in);
								String checkstudentname = userinput20.nextLine();
								
								int counter1 = 0;
								boolean keepcheck = true;
								while(keepcheck){
									if(checkstudentname.equals(DataBase.students.get(counter1).getName())){
										keepcheck = false;
										System.out.println("There is " + checkstudentname + "'s " + "information");
										System.out.println("Name: " + DataBase.students.get(counter1).getName() + " " + "Phonenumber: " + DataBase.students.get(counter1).getPhonenumber() + " " + "Address: " + DataBase.students.get(counter1).getAddress() + " " + "Birthday: " + DataBase.students.get(counter1).getBirthday());
									}
									
									
									
									else {
										counter1++;
										 if(counter1 >= DataBase.students.size()){
												System.out.println("There is no " + checkstudentname + " in the system");
												keepcheck = false;
											}
								}
								}
							}
								
							
					
					//No4
							else if(useranswer.equals("4")){
								System.out.println("What is your student's name?");
								Scanner userinput21 = new Scanner(System.in);
								String deleatname = userinput21.nextLine();
								boolean removecheck = true;
								int counter2 = 0;
								while(removecheck){
									if(deleatname.equals(DataBase.students.get(counter2).getName())){
										System.out.println("The system already find this name, type deleat to deleat this student");
										Scanner userinput22 = new Scanner(System.in);
										String deleat = userinput22.nextLine();
										if(deleat.equals("deleat"))
										DataBase.students.remove(counter2);
										removecheck = false;
										System.out.println("Good, " + deleatname + " is already out of the system" );
										
									}
									else{
										counter2 =+ 1;
										if(counter2 >= DataBase.students.size()){
											System.out.println("There is no " + deleatname + " in the system");
										}
									}
									 
								}
								
							}
					
				}

				}
						
					}
	}