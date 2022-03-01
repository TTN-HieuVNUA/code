package variable;

public class Car {

	public String mauSac;
	
	public String ten;
	
	public static void main(String[] args) {
		setX10();
		System.out.println(Variable.x);
		
		setX11();
		System.out.println(Variable.x);
	}
	public static void setX10() {
		Variable.x = 10;
	}
	
	public static void setX11() {
		Variable.x = 11;
	}
}
