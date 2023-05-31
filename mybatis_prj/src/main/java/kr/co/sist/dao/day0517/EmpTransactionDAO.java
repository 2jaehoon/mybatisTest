package kr.co.sist.dao.day0517;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.MyBatisHandler;
import kr.co.sist.vo.EmpVO;

@Component
public class EmpTransactionDAO {

	public int updateEmp( EmpVO eVO ) {
		int cnt = 0;
		
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. ���� method ȣ�� ��� ���
		cnt=ss.update("kr.co.sist.testMapper3.updateEmp",eVO);
		//3. transaction ó��
		if( cnt==1 ) {
			ss.commit();
		}//end if
		//4. MyBatis Handler �ݱ�
		if(ss!=null) {
			ss.close();
		}//end if
		
		return cnt;
	}//updateEmp
	
	public int deleteEmp( int empno ) {
		int cnt = 0;
		
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. ���� method ȣ�� ��� ���
		cnt=ss.delete("kr.co.sist.testMapper3.deleteEmp",empno);
		//3. transaction ó��
		if( cnt==1 ) {
			ss.commit();
		}//end if
		//4. MyBatis Handler �ݱ�
		if(ss!=null) {
			ss.close();
		}//end if
		
		return cnt;
	}//updateEmp
	
}//class
