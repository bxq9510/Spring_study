package InterfaceTest;

public class Test {
 public static void main(String[] args) {
//	 System.out.println("시작");
//	 IF_usb usb = new IF_usb(); // 객체X
	 IF_usb a = null; // 참조변수 선언은 가능
	 
	 a = new Fan(); // 인터페이스 자료형으로 다양한 객체를 참조할 수 있게 됩니다, <다형성>
	 a.input("kkk");
	 
	 a = new CellPhone();
	 a.input("kkk");
 }
}
