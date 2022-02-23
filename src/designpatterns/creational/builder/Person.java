package designpatterns.creational.builder;

public class Person {
	private String fname;
	private String lname;
	private int age;
	private String address;
	private String job;
	
	
	private Person(PersonBuilder pb) {
		this.fname = pb.fname;
		this.lname = pb.lname;
		this.age = pb.age;
		this.address = pb.address;
		this.job = pb.job;
	}

	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	public static class PersonBuilder {
		private String fname; //Richard
		private String lname; //Mansworth
		private int age;
		private String address = "No Address given";
		private String job = "N/A";
		
		
		public PersonBuilder(String fname, String lname) {
			this.fname = fname;
			this.lname = lname;
		}	
		
		public PersonBuilder fname(String fname) {
			this.fname = fname;
			return this;
		}
		
		public PersonBuilder lname(String lname) {
			this.lname = lname;
			return this;
		}
		
		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public PersonBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public PersonBuilder job(String job) {
			this.job = job;
			return this;
		}
		
		public Person build() {
			return new Person(this); //the current instance of personbuilder
		}
		
	}
	
	
}
