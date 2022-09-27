
public interface Convertible {
default void defaultMethod() {
	System.out.println("DefaultMethod");
	
}
static void staticMethod() {
	System.out.println("Static Method");
}
void convert();
}
