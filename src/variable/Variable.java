package variable;

public class Variable {
	/*
	 * biến trong java có 3 loại
	 * -biến local(sử dụng trong các khối lệnh, vd:if, for, hoặc phương thức...)
	 * - biến toàn cục:(sử dụng cho các đối tượng, không có từ khóa static)
	 * - biến của lớp: sử dụng cho toàn class, biến của lớp có từ khóa static đứng ở trước
	 */
	
	// bien toan cuc: là 1 trường class(field), 1 thuỘc tính của lớp Variable
	String var = "hieu";
	
	static int x = 9;
	
	public static void main(String[] args) {
//		int x = 30;
//		for(int i=0; i<5; i++) {
//			int y = 6;
//			System.out.println(y);
//		}
//		
//		if(x==30) {
//			int y = 50;
//			System.out.println(y);
//		}
		
//		Variable vars = new Variable();
//		Car cars = new Car();
//		
//		vars.var = "nam";
//		System.out.println(vars);
		
		System.out.println(Variable.x);
	}
	
	
}
