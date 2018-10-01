import java.util.ArrayList;

public class DataBase
	{
		public	static ArrayList<Student>students = new ArrayList<Student>();
		
		public static void fillarray (String[] args){
			students.add(new Student("Kenny","(479)-430-0103","7251 S Polo Ridge Drive"));
		}
		
		
		
	}
