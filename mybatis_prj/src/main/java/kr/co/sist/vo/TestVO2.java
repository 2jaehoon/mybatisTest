package kr.co.sist.vo;

import lombok.Getter;
import lombok.Setter;

/**
 *  ��� �ν��Ͻ� ������ ���ؼ��� getter�� �����, (Ŭ���� ��)
 *  �̸��� �ּҸ� setter( Ư�� ������ ���ؼ��� ���� ������ ���� ���� ���� )�� ����� �ʹ�.
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
