package kr.co.sist.dao.day0522;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.MyBatisHandler;
import kr.co.sist.domain.CarDomain;
import kr.co.sist.domain.EmpDomain;

@Component
public class SelectDAO4 {
	
	public List<EmpDomain> union() throws PersistenceException{
		List<EmpDomain> list = null;
		
		//1. MaBis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler ���
		list=ss.selectList("union");
		//3. MyBatis Handler ���
		if(ss!=null) {
		ss.close();
		}//end if
		
		return list;
	}
	
	//��� ������ ��ȸ
	public List<String> selectAllMaker() throws PersistenceException{
		List<String> list = null;
		
		//1. MaBis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler ���
		list=ss.selectList("selectAllMaker");
		//3. MyBatis Handler ���
		if(ss!=null) {
		ss.close();
		}//end if
		
		return list;
	}
	
	//�Էµ� �������� �� ��ȸ
		public List<CarDomain> join( HashMap hm ) throws PersistenceException{
			List<CarDomain> list = null;
			
			//1. MaBis Handler ���
			SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
			//2. handler ���
			list=ss.selectList("selectJoin", hm);
			//3. MyBatis Handler ���
			if(ss!=null) {
			ss.close();
			}//end if
			
			return list;
		}
		
		
		//�Էµ� �������� �� ��ȸ
				public List<CarDomain> joinSubQuery( HashMap hm ) throws PersistenceException{
					List<CarDomain> list = null;
					
					//1. MaBis Handler ���
					SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
					//2. handler ���
					list=ss.selectList("join_subquery", hm);
					//3. MyBatis Handler ���
					if(ss!=null) {
					ss.close();
					}//end if
					
					return list;
				}
				
				
				public List<EmpDomain> dynamicTable(String tName) throws PersistenceException{
					List<EmpDomain> list = null;
					
					//1. MaBis Handler ���
					SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
					//2. handler ���
					list=ss.selectList("dynamicTable", tName);
					//3. MyBatis Handler ���
					if(ss!=null) {
					ss.close();
					}//end if
					
					return list;
				}

}//class
