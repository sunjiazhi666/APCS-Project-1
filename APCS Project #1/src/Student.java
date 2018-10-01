
public class Student
	{
		private String name;
		private String phonenumber;
		private String address;
		
		public Student (String n, String p, String a){
			name = n;
			phonenumber = p;
			address = a;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getPhonenumber()
			{
				return phonenumber;
			}

		public void setPhonenumber(String phonenumber)
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
