package question2;

public class Main {

	public static void main(String[] args) {
		Account a = new Account(500000,30000,40000);
		System.out.println(a.accbal());
		System.out.println(a.Deposite(46600));
        System.out.println(a.Withdraw(5000));
	}
	

}
