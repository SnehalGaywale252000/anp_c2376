package question2;

public class Account extends RBI {
private double	accbal;
private double withdraw;
private double deposite;
public Account(double accbal, double withdraw, double deposite) {
	super();
	this.accbal = accbal;
	this.withdraw = withdraw;
	this.deposite = deposite;
}
/*public double getAccbal() {
	return accbal;
}
public void setAccbal(double accbal) {
	this.accbal = accbal;
}
public double getWithdraw() {
	return withdraw;
}
public void setWithdraw(double withdraw) {
	this.withdraw = withdraw;
}
public double getDeposite() {
	return deposite;
}
public void setDeposite(double deposite) {
	this.deposite = deposite;
}
*/
double  accbal() {
	return accbal;
}
double Withdraw(double withdraw) {
	accbal=accbal-withdraw;
	return accbal;
}
double Deposite(double deposite) {
	accbal=accbal+deposite;
	return accbal;
}



}
