package kr.co.sist.dao.day0517;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.MyBatisHandler;

@Component
public class SelectDAO {
	/**
	 * �÷� �ϳ��� �� �� ��ȸ
	 * @param deptno
	 * @return
	 */
	public String scsr(int deptno) {
		String dname = "";
		
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler ���
		dname = ss.selectOne("scsr", deptno);
		//3. ��ȸ ��� ó��
		
		//4. MyBatis Handler �ݱ�
		if(ss != null) {
			ss.close();
		}
		
		return dname;
	}//scsr
	
	
	//�÷� �ϳ��� ���� �� ��ȸ
	public List<String> scmr() {
       List<String> list = new ArrayList<String>();
		
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler ���
		list = ss.selectList("scmr");
		//3. ��ȸ ��� ó��
		
		//4. MyBatis Handler �ݱ�
		if(ss != null) {
			ss.close();
		}//end if
		
		return list;
		
	}
	
	
	
	
//	public static void main(String[] args) {
//		new SelectDAO().scmr();
//	}

}
