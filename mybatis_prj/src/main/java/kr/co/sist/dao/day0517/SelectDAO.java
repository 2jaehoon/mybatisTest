package kr.co.sist.dao.day0517;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.MyBatisHandler;

@Component
public class SelectDAO {
	/**
	 * 컬럼 하나에 한 행 조회
	 * @param deptno
	 * @return
	 */
	public String scsr(int deptno) {
		String dname = "";
		
		//1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용
		dname = ss.selectOne("scsr", deptno);
		//3. 조회 결과 처리
		
		//4. MyBatis Handler 닫기
		if(ss != null) {
			ss.close();
		}
		
		return dname;
	}//scsr
	
	
	//컬럼 하나에 여러 행 조회
	public List<String> scmr() {
       List<String> list = new ArrayList<String>();
		
		//1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용
		list = ss.selectList("scmr");
		//3. 조회 결과 처리
		
		//4. MyBatis Handler 닫기
		if(ss != null) {
			ss.close();
		}//end if
		
		return list;
		
	}
	
	
	
	
//	public static void main(String[] args) {
//		new SelectDAO().scmr();
//	}

}
