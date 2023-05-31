package kr.co.sist.dao.day0516;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.MyBatisHandler;
import kr.co.sist.vo.EmpVO;

@Component
public class EmpDAO {
	public int insertEmp( EmpVO empVO ) {
		//MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//Handler 사용
		int cnt = ss.insert("kr.co.sist.testMapper2.insertEmp", empVO);
		//transaction 완료
		if( cnt==1 ) {
			System.out.println("추가 성공 => commit");
			ss.commit();
		}else {
		System.out.println("추가 실패");
		}
		//연결 끊기
		if(ss != null) {
			ss.close();
		}//end if
		return cnt;
	}//insertEmp
	
	public static void main(String[] args) {
		
		EmpDAO ed = new EmpDAO(); 
		EmpVO e = new EmpVO();
		e.setEmpno(2023);
		e.setEname("황충");
		e.setJob("연");
		e.setDeptno(10);
		 ed.insertEmp(e);
	}
		 
		/*
		 * int sum =0; long st = System.currentTimeMillis(); for(int i = 0; i<10000;
		 * i++) { sum+=i; System.out.println(i + " / " + sum); }
		 * 
		 * System.out.println(sum); long et = System.currentTimeMillis();
		 * System.out.println((et-st) + "ms");
		 */
	//
	
	
}
