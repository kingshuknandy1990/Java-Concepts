
public class ObjectPassingInJava {
	public static void main(String[] args) {
		Paper p=new Paper();
		p.setText("Hello World");
		System.out.println(p.getText());

		Printer pr=new Printer();
		pr.print(p);
		System.out.println(p.getText());
	}
}

class Printer{
	public void print(Paper p) {
		p.setText("Get Lost");
	}
}

class Paper{
	String text;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}