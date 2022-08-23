
public class Main {

	public static void main(String[] args) {
		Employee emp=new Employee("ram",25,99667788,"Pune",20000,"IT");
		Manager mng=new Manager("sham",30,68789879,"Mumbai",40000,"IT");
		emp.printSalary();
		mng.printSalary();
	}

}
