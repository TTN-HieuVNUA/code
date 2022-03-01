package variable;

// thao tác với lớp String trong java
public class StringLearn {

	public static void main(String[] args) {
		String s = "tran/hoang/nam";
//		String name[] = s.split("/");
//		
//		
//		System.out.println("day la do dai cua mang name: "+name.length);
		
		
		// vòng for duyệt từ 0-> độ dài của mảng name
//		for (int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//		}
		
		// hàm charAt() - trả về 1 kí tự ở 1 vị trí nào đó trong 1 chuỗi String
//		System.out.println("do dai cua chuoi s= "+s.length());
//		
//		int count=0;
//		for(int i=0; i< s.length(); i++) {
//			if (s.charAt(i) == ' ') {
//				count = (count+1);
//				if (count ==2) {
//					System.out.println(s.substring(11));
//				}
//			}
//		}
//		
//		System.out.println(s.isEmpty());
//		
		// dùng hàm replace(kí tự cũ, kí tự mới) để đổi chuỗi tran/hoang/nam ==> tran hoang nam
		// 
//		System.out.println(s);
//		s = s.replace("/", " ");
//		System.out.println(s);
		
		// dùng hàm concat để nối 2 chuỗi với nhau
		
		String u = "nam";
		String x = "hoang";
		
		u = u.concat(" ").concat(x);
		System.out.println(u);
		
		// regex pattern : biểu thức chính quy
		
		
	}
}
