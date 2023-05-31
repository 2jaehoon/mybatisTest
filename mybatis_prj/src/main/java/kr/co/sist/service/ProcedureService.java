package kr.co.sist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.day0523.SelectDAO5;
import kr.co.sist.vo.EmpInsertVO;
import kr.co.sist.vo.EmpVO;

@Component
public class ProcedureService {
	
	@Autowired(required = false)
	private SelectDAO5 sDAO5;
	
	public void insertProc(EmpInsertVO eiVO) {
		
		sDAO5.insertProc(eiVO);
		
	}//insertProc
	
	public List<EmpVO> selectAllCpEmp(){
		List<EmpVO> list = null;
		
		list = sDAO5.selectAllproc();
		
		return list;
	}
	
	
	public List<EmpVO> selectDeptnoCpEmp(int deptno){
		List<EmpVO> list = null;
		
		list = sDAO5.selectDeptProc(deptno);
		
		return list;
	}
	
	

}
