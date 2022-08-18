package sg.module;

public class Addition {
 int number1=90;
 int number2=5;
 int result = 0;
 void sum() {
	 result=number1+number2;
	 System.out.println(result);
	 System.out.println("The result:"+result);
	 
 }
  void display() {
	  int num1;
	  num1=10;
	  int value=20;
	  System.out.println("Display method "+result);
  }
  static void print() {
	  System.out.println("static print method");
  }
	public static void main(String[] args) {
	System.out.println("Main Method");
	print();
	Addition a = new Addition();
	a.sum();
	a.display();

	}

}
