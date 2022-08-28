package question2;

public class Customer extends RBI {
private String name;
private long Accountno;
private int  age;
public Customer(String name, long accountno, int age) {
	super();
	this.name = name;
	Accountno = accountno;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAccountno() {
	return Accountno;
}
public void setAccountno(long accountno) {
	Accountno = accountno;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
