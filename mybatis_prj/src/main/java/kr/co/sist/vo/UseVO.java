package kr.co.sist.vo;

public class UseVO {

	public static void main(String[] args) {
		TestVO tv = new TestVO();
		tv.setName("윤상");
		tv.setAge(25);

		System.out.println(tv.getAge() + "/" + tv.getName());
		
		System.out.println("----------------------");
		TestVO2 tv2 = new TestVO2();
		
	//tv2. 생성된  getter와 setter를 확인할 수 있다.
	}

}
