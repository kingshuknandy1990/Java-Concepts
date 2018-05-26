
public class FinalDemo extends A {
	public static void main(String[] args) {
		//A obj=new A();
		//System.out.println("Value of a: "+obj.a);
		//obj.a=5;
	}
	
	
}
class A{
	final int a=3;//we have not initialized the final variable
	public A() {	
		//a=10;//So we can initialize it anywhere
		//a=5;//This will again throw compilation error as already initialized
	
	}
	{
		
	}
	
	public final void abc() {
		
	}
}