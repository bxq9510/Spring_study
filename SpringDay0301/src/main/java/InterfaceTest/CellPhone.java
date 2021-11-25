package InterfaceTest;

public class CellPhone implements IF_usb { // implements 구현, IF_usb -> 선언

	@Override
	public void input(String kkk) {
		// TODO Auto-generated method stub
		System.out.println("폰을 입력한다");
	}

	@Override
	public String delete(String kkk) {
		// TODO Auto-generated method stub
		System.out.println("폰을 삭제한다");
		return null;
	}

}
