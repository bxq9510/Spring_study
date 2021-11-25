package InterfaceTest;

public class Fan implements IF_usb {

	@Override
	public void input(String kkk) {
		// TODO Auto-generated method stub
		System.out.println("팬을 돌린다");
	}

	@Override
	public String delete(String kkk) {
		// TODO Auto-generated method stub
		System.out.println("팬을 삭제한다");
		return null;
	}

}
