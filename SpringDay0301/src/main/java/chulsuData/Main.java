package chulsuData;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "철수";
		IF_do ifdo = null;
		
		ifdo = new mysqlCls();
		System.out.println(name + " / mysql에 insert");
		ifdo.insert();
		System.out.println(name + " / mysql에 select");
		ifdo.select();
		
		ifdo = new oracleCls();
		System.out.println(name + " / oracle에 insert");
		ifdo.insert();
		System.out.println(name + " / oracle에 select");
		ifdo.select();
	}

}
