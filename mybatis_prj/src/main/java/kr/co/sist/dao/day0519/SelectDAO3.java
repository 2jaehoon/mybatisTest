package kr.co.sist.dao.day0519;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.MyBatisHandler;
import kr.co.sist.domain.CarDomain;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.vo.CarSearchVO;

@Component
public class SelectDAO3 {
	
	public List<CarDomain> subquery()throws PersistenceException{
		List<CarDomain> list = null;
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler ��� : <select id = "subquery" resultMap = "cdResult">
		//parameterType�� �����Ƿ� �Ű����� �ϳ��� �޼��带 ����Ѵ�.
		list=ss.selectList("subquery");
		//3. MyBatis Handler �ݱ�
		if(ss!=null) {
			ss.close();
		}//end if
		
		return list;
	}//subquery
	
	public List<EmpDomain> dynamicWhere(int deptno)throws PersistenceException{
		List<EmpDomain> list = null;
		//1. MyBatis Handler ���
				SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. handler ��� : <select id = "subquery" resultMap = "cdResult">
				//parameterType�� �����Ƿ� �Ű����� �ϳ��� �޼��带 ����Ѵ�.
				list=ss.selectList("where",deptno);
				//3. MyBatis Handler �ݱ�
				if(ss!=null) {
					ss.close();
				}//end if
		
		return list;
	}
	
	public List<CarDomain> dynamicIf( CarSearchVO csVO ){
		List<CarDomain> list = null;
		//1. MyBatis Handler ���
				SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. handler ��� : <select id = "subquery" resultMap = "cdResult">
				//parameterType�� �����Ƿ� �Ű����� �ϳ��� �޼��带 ����Ѵ�.
				list=ss.selectList("dynamicIf",csVO);
				//3. MyBatis Handler �ݱ�
				if(ss!=null) {
					ss.close();
				}//end if
		
				return list;
	}
	
	
	public List<EmpDomain> dynamicChoose(int jobType)throws PersistenceException{
		List<EmpDomain> list = null;
		//1. MyBatis Handler ���
				SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. handler ��� : <select id = "subquery" resultMap = "cdResult">
				//parameterType�� �����Ƿ� �Ű����� �ϳ��� �޼��带 ����Ѵ�.
				list=ss.selectList("dynamicChoose",jobType);
				//3. MyBatis Handler �ݱ�
				if(ss!=null) {
					ss.close();
				}//end if
		
		return list;
	}
	
	public List<EmpDomain> dynamicForeach(HashMap map)throws PersistenceException{
		List<EmpDomain> list = null;
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler ��� : <select id = "subquery" resultMap = "cdResult">
		//parameterType�� �����Ƿ� �Ű����� �ϳ��� �޼��带 ����Ѵ�.
		list=ss.selectList("dynamicForeach",map);
		//3. MyBatis Handler �ݱ�
		if(ss!=null) {
			ss.close();
		}//end if
		
		return list;
	}
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("SALESMAN");
		list.add("MANAGER");
//		list.add("ANALYST");
//		list.add("PRESIDENT");
//		list.add("CLERK");
		
		HashMap map = new HashMap();
		map.put("selectJob", list);
		
		
		new SelectDAO3().dynamicForeach(map);
	}

}
