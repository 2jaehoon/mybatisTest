package kr.co.sist.dao.day0518;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.MyBatisHandler;
import kr.co.sist.domain.CarDomain;
import kr.co.sist.domain.DeptDomain;
import kr.co.sist.domain.EmpDomain;

@Component
public class SelectDAO2 {
	
	/**
	 * �÷� �������� �� �ϳ� ��ȸ
	 * �μ���ȣ�� �Է¹޾� �μ���, ��ġ�� ��ȯ
	 * @param deptno
	 * @return
	 * @throws PersistenceException
	 */
	public DeptDomain mcsr(int deptno)throws PersistenceException{
		DeptDomain dd = null;
		//1. MyBatis Handler ���
		SqlSession ss  = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. ���� ���� �� ��� ���
		dd = ss.selectOne("kr.co.sist.selectMapper2.mcsr", deptno);
		//3. MyBatis Handler �ݱ�
		if(ss!=null) {
			ss.close();
		}//end if
		return dd;
	}//mcsr
	
	//���� �÷��� ������ ��ȸ
	public List<EmpDomain> mcmr(int deptno)throws PersistenceException{
		List<EmpDomain> list = null;
		
		//1. MyBatis Handler ���
				SqlSession ss  = MyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. ���� ���� �� ��� ���
				list = ss.selectList("kr.co.sist.selectMapper2.mcmr", deptno);
				//3. MyBatis Handler �ݱ�
				if(ss!=null) {
					ss.close();
				}//end if
		
		return list;
	}
	
	
	//< �� ���
		public List<EmpDomain> lessThan(int sal)throws PersistenceException{
			List<EmpDomain> list = null;
			
			//1. MyBatis Handler ���
					SqlSession ss  = MyBatisHandler.getInstance().getMyBatisHandler(false);
					//2. ���� ���� �� ��� ���
					list = ss.selectList("kr.co.sist.selectMapper2.lessThan", sal);
					//3. MyBatis Handler �ݱ�
					if(ss!=null) {
						ss.close();
					}//end if
			
			return list;
		}
		
		//> �� ���
		public List<EmpDomain> greaterThan(int sal)throws PersistenceException{
			List<EmpDomain> list = null;
			
			//1. MyBatis Handler ���
			SqlSession ss  = MyBatisHandler.getInstance().getMyBatisHandler(false);
			//2. ���� ���� �� ��� ���
			list = ss.selectList("kr.co.sist.selectMapper2.greaterThan", sal);
			//3. MyBatis Handler �ݱ�
			if(ss!=null) {
				ss.close();
			}//end if
			
			return list;
		}
		
		//> �� ���
				public List<CarDomain> like(String option)throws PersistenceException{
					List<CarDomain> list = null;
					
					//1. MyBatis Handler ���
					SqlSession ss  = MyBatisHandler.getInstance().getMyBatisHandler(false);
					//2. ���� ���� �� ��� ���
					list = ss.selectList("kr.co.sist.selectMapper2.like", option);
					//3. MyBatis Handler �ݱ�
					if(ss!=null) {
						ss.close();
					}//end if
					
					return list;
				}
	
	public static void main(String[] args) {
		
		System.out.println( new SelectDAO2().like("�����") );
		
	}//main

}//class
