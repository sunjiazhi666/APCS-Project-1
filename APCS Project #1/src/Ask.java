import java.util.ArrayList;
import java.util.Scanner;

public class Ask
	{
		
		public	static ArrayList<Student>name = new ArrayList<Student>();
		public static void main(String[] args)
			{
				
				
				//Ask user want to check or input the new name
				
				System.out.println("Do you want to check or key in the information?");
				Scanner userinput1 = new Scanner(System.in);
				String useranswer = userinput1.nextLine();
				
				
				if(useranswer.equals("check")){
					System.out.println("Do you wan to check the information or total students");
					Scanner userinput2 = new Scanner(System.in);
					String answer = userinput2.nextLine();
					
					if(answer.equals("total students")){
						System.out.println(name.size());
					}
					
					
					
				}
				
				//Key in the information
				else if(useranswer.equals("key in")){
					System.out.println("Please follow the direction");
					Scanner userinput6 = new Scanner(System.in);
					
					//Basic information(Name, address etc.)
					if(userinput6.equals("basic information")){
					
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
					
					name.add (new Student (nameinput,parentphonenumber,address));
					}
					
					
						
						
						
						
					}
					
					
					
				}
				
				
				

			}

	
