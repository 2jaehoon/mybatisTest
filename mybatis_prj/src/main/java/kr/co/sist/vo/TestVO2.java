package kr.co.sist.vo;

import lombok.Getter;
import lombok.Setter;

/**
 *  모든 인스턴스 변수에 대해서는 getter를 만들고, (클래스 위)
 *  이름과 주소만 setter( 특정 변수에 대해서만 만들 때에는 변수 위에 선언 )를 만들고 싶다.
 * @author user
 *
 */
@Getter
public class TestVO2 {
	@Setter
	private String name;
	@Setter
	private String addr;
	private String zipcode;
	private int age;

}
