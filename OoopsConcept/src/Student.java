class Demo{
	int a=10;

	 
	 void m2() {
		 System.out.println(System.identityHashCode(a));
	 }
	void m1() {
		
		System.out.println(System.identityHashCode(a));
		
		
	}
}


public class Student extends Demo {

	public static void main(String[] args) {
		String str="Amrit";
		System.out.println(str.hashCode());
		str.concat("Sengupta");
		
		System.out.println(str.hashCode());
		System.out.println(str);
	}

}

