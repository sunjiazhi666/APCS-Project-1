
public class Student
	{
		private String name;
		private int phonenumber;
		private String address;
		
		public Student (String n, int p, String a){
			n = name;
			p = phonenumber;
			a = address;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getPhonenumber()
			{
				return phonenumber;
			}

		public void setPhonenumber(int phonenumber)
			{
				this.phonenumber = phonenumber;
			}

		public String getAddress()
			{
				return address;
			}

		public void setAddress(String address)
			{
				this.address = address;
			}
		
		
	}
