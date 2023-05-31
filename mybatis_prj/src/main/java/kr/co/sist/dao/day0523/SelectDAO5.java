package kr.co.sist.dao.day0523;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.MyBatisHandler;
import kr.co.sist.vo.EmpInsertVO;
import kr.co.sist.vo.EmpVO;

@Component
public class SelectDAO5 {
	
	public void insertProc(EmpInsertVO eiVO)throws PersistenceException {
		
		//1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용
		ss.selectOne("insertProc", eiVO);
		//3.MyBatis Handler 닫기
		if(ss!=null) {
			ss.close();
		}//end if
		
	}//insertProc
	
	public List<EmpVO> selectAllproc()throws PersistenceException{
		List<EmpVO> list =new ArrayList<EmpVO>();
		
		//값을 넣거나 받기 위한 Map 생성
		HashMap map = new HashMap();
		//1. MyBatis Handler 얻기
				SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. handler 사용
				ss.selectOne("selectAllCpEmp", map);
				//3.MyBatis Handler 닫기
				if(ss!=null) {
					ss.close();
				}//end if
				//조회 결과가 List에 Map객체가 저장된 형태이므로 view에서 사용하기 어렵다.
				
				List<Map> templist = (List<Map>)map.get("all_cp_emp");
				EmpVO tempEmp = null;
				Date hiredate = null;
				Timestamp time = null;
				for( Map tempMap : templist ) {
					tempEmp = new EmpVO();
					tempEmp.setEmpno( ((BigDecimal) tempMap.get("EMPNO")).intValue() );
					tempEmp.setEname( (String) tempMap.get("ENAME") );
					tempEmp.setJob( (String) tempMap.get("JOB") );
					tempEmp.setSal( ((BigDecimal) tempMap.get("SAL")).intValue() );
					tempEmp.setDeptno( ((BigDecimal) tempMap.get("DEPTNO")).intValue() );
					time = (Timestamp) tempMap.get("HIREDATE");
					hiredate = new Date(time.getTime());
					tempEmp.setHiredate(hiredate);
					
					list.add(tempEmp);
					System.out.println(tempEmp);
					//System.out.println(tempMap.get("EMPNO") +" / " + tempMap.get("ENAME") );
				}
				//empno, ename, , sal, deptno,  hiredate
				
		return list;
	}//selectAllproc
	
	
	public List<EmpVO> selectDeptProc(int deptno)throws PersistenceException{
		List<EmpVO> list =new ArrayList<EmpVO>();
		
		//값을 넣거나 받기 위한 Map 생성
		HashMap map = new HashMap();
		map.put("deptno", deptno);//입력받은 값을 맵에 설정
		//1. MyBatis Handler 얻기
				SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. handler 사용
				ss.selectOne("selectDeptCpEmp", map);
				//3.MyBatis Handler 닫기
				if(ss!=null) {
					ss.close();
				}//end if
				//조회 결과가 List에 Map객체가 저장된 형태이므로 view에서 사용하기 어렵다.
				
				List<Map> templist = (List<Map>)map.get("dept_cp_emp");
				EmpVO tempEmp = null;
				Date hiredate = null;
				Timestamp time = null;
				for( Map tempMap : templist ) {
					tempEmp = new EmpVO();
					tempEmp.setEmpno( ((BigDecimal) tempMap.get("EMPNO")).intValue() );
					tempEmp.setEname( (String) tempMap.get("ENAME") );
					tempEmp.setJob( (String) tempMap.get("JOB") );
					tempEmp.setSal( ((BigDecimal) tempMap.get("SAL")).intValue() );
					tempEmp.setDeptno( ((BigDecimal) tempMap.get("DEPTNO")).intValue() );
					time = (Timestamp) tempMap.get("HIREDATE");
					hiredate = new Date(time.getTime());
					tempEmp.setHiredate(hiredate);
					
					list.add(tempEmp);
					System.out.println(tempEmp);
					//System.out.println(tempMap.get("EMPNO") +" / " + tempMap.get("ENAME") );
				}
				//empno, ename, , sal, deptno,  hiredate
				
		return list;
	}//selectAllproc
	
	
	 public static void main(String[] args) { 
		 new SelectDAO5().selectDeptProc(10); 
		 }
	 
	

}
