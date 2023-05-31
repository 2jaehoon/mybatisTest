package kr.co.sist.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor//매개변수 있는 생성자
@NoArgsConstructor//기본 생성자
@Getter//setter 메서드
@Setter//getter 메서드
public class TestVO {
	private String name;
	private int age;

}
