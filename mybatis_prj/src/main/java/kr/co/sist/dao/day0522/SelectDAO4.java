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
		
		//1. MaBis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용
		list=ss.selectList("union");
		//3. MyBatis Handler 사용
		if(ss!=null) {
		ss.close();
		}//end if
		
		return list;
	}
	
	//모든 제조사 조회
	public List<String> selectAllMaker() throws PersistenceException{
		List<String> list = null;
		
		//1. MaBis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용
		list=ss.selectList("selectAllMaker");
		//3. MyBatis Handler 사용
		if(ss!=null) {
		ss.close();
		}//end if
		
		return list;
	}
	
	//입력된 제조사의 모델 조회
		public List<CarDomain> join( HashMap hm ) throws PersistenceException{
			List<CarDomain> list = null;
			
			//1. MaBis Handler 얻기
			SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
			//2. handler 사용
			list=ss.selectList("selectJoin", hm);
			//3. MyBatis Handler 사용
			if(ss!=null) {
			ss.close();
			}//end if
			
			return list;
		}
		
		
		//입력된 제조사의 모델 조회
				public List<CarDomain> joinSubQuery( HashMap hm ) throws PersistenceException{
					List<CarDomain> list = null;
					
					//1. MaBis Handler 얻기
					SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
					//2. handler 사용
					list=ss.selectList("join_subquery", hm);
					//3. MyBatis Handler 사용
					if(ss!=null) {
					ss.close();
					}//end if
					
					return list;
				}
				
				
				public List<EmpDomain> dynamicTable(String tName) throws PersistenceException{
					List<EmpDomain> list = null;
					
					//1. MaBis Handler 얻기
					SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
					//2. handler 사용
					list=ss.selectList("dynamicTable", tName);
					//3. MyBatis Handler 사용
					if(ss!=null) {
					ss.close();
					}//end if
					
					return list;
				}

}//class
