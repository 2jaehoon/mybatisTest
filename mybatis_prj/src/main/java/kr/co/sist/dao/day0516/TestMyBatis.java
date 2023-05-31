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
		
		//1������ xml ����
		try {
			Reader reader = Resources.getResourceAsReader("kr/co/sist/dao/MyBatisConfig.xml");
			//2���̹�Ƽ�� �����ӿ�ũ ����
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
			
			if( reader!=null ) {
				reader.close();
			}//end if
			//3. ���̹ٵ� �ڵ鷯 ���
			SqlSession ss = ssf.openSession();
			//4. �ڵ鷯 ���
			List<String> list = ss.selectList("selectEmp");
			System.out.println(list);
			//5. �ڵ鷯 ����
			if( ss!=null ) {
				ss.close();
			}//end if
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}//main

}//class
