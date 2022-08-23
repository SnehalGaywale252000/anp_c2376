
public class Manager extends Member {
private String department;
public Manager(String name,int age,int PhoneNumber,String address,double salary,String department ) {
	super(name,age,PhoneNumber,address,salary);
	this.department=department;
}
}
