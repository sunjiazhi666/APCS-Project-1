import java.util.ArrayList;

public class DataBase
	{
		
		public	static ArrayList<Student>students = new ArrayList<Student>();
		
		public static void fillarray (){
			students.add(new Student("Kenny","(479)-430-0103","7251 S Polo Ridge Drive","11.16.2001"));
			students.add(new Student("Scot","(720)-725-8604","2707 S.Simms.Ave","0.0.0000"));
		
		}
		
		
		
	}
