import demo.ABC;

public class AbstractDemo {
	public static void main(String[] args) {
		Human obj= new Man(); //Object has been created 
		obj.i=5;
		
		Man man=new Man();
		
		//Human human=new Human();
	}
}
abstract class Human{ // Abstract Class
	abstract public void eat() ;
	abstract public void walk();
	public void test() {
	System.out.println("abc");	
	}
	int i;
	
}

class Man extends Human{ //Concrete Class//Implementation Class


}



