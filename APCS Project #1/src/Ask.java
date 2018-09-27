import java.util.ArrayList;
import java.util.Scanner;

public class Ask
	{
		public static void main(String[] args)
			{
				
				
				//Ask user want to check or input the new name
				
				System.out.println("Do you want to check or key in the information?");
				Scanner userinput1 = new Scanner(System.in);
				String useranswer = userinput1.nextLine();
				
				
				if(useranswer.equals("check")){
					System.out.println("What name do you want to check");
					Scanner userinput2 = new Scanner(System.in);
					String namecheck = userinput2.nextLine();
					
				}
				
				else if(useranswer.equals("key in")){
					System.out.println("Please follow the direction");
					System.out.println("1.What is your childre's name?");
					Scanner userinput3 = new Scanner(System.in);
					String nameinput =  userinput3.nextLine();
					
					
					
				}
				
				
				

			}

	}
