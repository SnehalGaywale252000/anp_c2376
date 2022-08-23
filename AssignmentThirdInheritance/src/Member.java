
public class Member {
   String Name;
   int age;
   int PhoneNumber;
   String Address;
   double salary;
   
   public Member(String name, int age, int phoneNumber, String address, double salary) {
	super();
	Name = name;
	this.age = age;
	this.PhoneNumber = phoneNumber;
	this.Address = address;
	this.salary = salary;
}

public void printSalary() {
	   System.out.println("Salary" +salary);
   }
}
