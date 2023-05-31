package kr.co.sist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.day0516.EmpDAO;
import kr.co.sist.dao.day0517.EmpTransactionDAO;
import kr.co.sist.vo.EmpVO;

@Component
public class EmpService {
	@Autowired( required = false )
	private EmpDAO eDAO;
	@Autowired( required = false )
	private EmpTransactionDAO etDAO;
	
	public boolean addEmp(EmpVO eVO) {
		int cnt = eDAO.insertEmp(eVO);
		
		return cnt==1;
	}

	public boolean modifyEmp(EmpVO eVO) {
		int cnt = etDAO.updateEmp(eVO);
		
		return cnt==1;
	}
	
	public boolean removeEmp(int empno) {
		int cnt = etDAO.deleteEmp(empno);
		
		return cnt==1;
	}
}
