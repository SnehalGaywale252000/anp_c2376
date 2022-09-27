
public class MethodReferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Convertible convertible = Convertible::staticMethod;
       convertible.convert();
       Convertible convertible1= Message::new;
       convertible1.convert();
       Message message = new Message();
       Convertible convertible2=message::greet;
       convertible2.convert();
       Dispayable displayable=String::toUpperCase;
       System.out.println(displayable.display("Java"));
	}

}
