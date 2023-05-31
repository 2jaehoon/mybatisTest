package kr.co.sist.dao.day0516;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMyBatis {

	public static void main(String[] args) {
		
		//1설정용 xml 연결
		try {
			Reader reader = Resources.getResourceAsReader("kr/co/sist/dao/MyBatisConfig.xml");
			//2마이바티스 프레임워크 생성
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
			
			if( reader!=null ) {
				reader.close();
			}//end if
			//3. 마이바디스 핸들러 얻기
			SqlSession ss = ssf.openSession();
			//4. 핸들러 사용
			List<String> list = ss.selectList("selectEmp");
			System.out.println(list);
			//5. 핸들러 종료
			if( ss!=null ) {
				ss.close();
			}//end if
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}//main

}//class
