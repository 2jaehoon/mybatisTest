package kr.co.sist.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.day0517.SelectDAO;
import kr.co.sist.dao.day0518.SelectDAO2;
import kr.co.sist.dao.day0519.SelectDAO3;
import kr.co.sist.domain.CarDomain;
import kr.co.sist.domain.DeptDomain;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.vo.CarSearchVO;

@Component
public class SelectService {
	
	@Autowired(required = false)
	private SelectDAO sDAO;
	
	@Autowired(required = false)
	private SelectDAO2 sDAO2;
	
	@Autowired(required = false)
	private SelectDAO3 sDAO3;
	
	public String scsr(int deptno) throws PersistenceException {
		String dname= "";
		
		dname= sDAO.scsr(deptno);
		
		return dname;
	}//scsr
	
	@Autowired(required = false)
	//컬럼 하나에 여러 행 조회
	public List<String> scmr(){
		List<String> list = sDAO.scmr();
		
		return list;
	}//scmr
	
	
	//////////////////05-18-2023추가////////////////////
	public DeptDomain mcsr(int deptno) {
		
		DeptDomain dd = sDAO2.mcsr(deptno);
		
		return dd;
	}//mcsr
	
public List<EmpDomain> mcmr(int deptno) {
		
	List<EmpDomain> list = sDAO2.mcmr(deptno);
		
		return list;
	}//mcsr

public List<EmpDomain> lessthan(int sal) {
	
	List<EmpDomain> list = sDAO2.lessThan(sal);
		
		return list;
	}//mcsr

public List<EmpDomain> greaterthan(int sal) {
	
	List<EmpDomain> list = sDAO2.greaterThan(sal);
		
		return list;
	}//mcsr

public List<CarDomain> like(String option) {
	
	List<CarDomain> list = sDAO2.like(option);
		
		return list;
	}//like

public List<CarDomain> subquery() {
	
	List<CarDomain> list = sDAO3.subquery();
		
		return list;
	}//subquery

public List<EmpDomain> dynamicWhere(int deptno) {
	
	List<EmpDomain> list = sDAO3.dynamicWhere(deptno);
		
		return list;
	}//dynamicWhere

public List<CarDomain> dynamicIf(CarSearchVO csVO) {
	
	List<CarDomain> list = sDAO3.dynamicIf(csVO);
		
		return list;
	}//dynamicIf

public List<EmpDomain> dynamicChoose(int jobType) {
	
	List<EmpDomain> list = sDAO3.dynamicChoose(jobType);
		
		return list;
	}//dynamicIf

public List<EmpDomain> dynamicForeach(String[] job) {
	HashMap map = new HashMap();
	//배열도 됨.
	List<String> jobList = new ArrayList<String>();
	List<EmpDomain> list = null;
	if(job!=null) {
	for(String temp : job) {
		jobList.add(temp);
	}//end for
	
	map.put("selectJob", jobList);
	list = sDAO3.dynamicForeach(map);
	}
		
		return list;
	}//dynamicIf
	
	
	
}//class
