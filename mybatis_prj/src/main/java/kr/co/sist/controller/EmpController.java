package kr.co.sist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.domain.EmpDomain;
import kr.co.sist.service.EmpService;
import kr.co.sist.vo.EmpVO;

@Controller
public class EmpController {

	@Autowired( required = false )
	private EmpService es;
	
	@PostMapping("/emp_add.do")
	public String addEmp( EmpVO eVO ) {
		String resultPage = "add_fail";
		
		if( es.addEmp(eVO) ) {
			resultPage="add_success";
		}//end if
		
		
		return resultPage; 
	}
	
	
	@GetMapping("/day0517/emp_modify_frm.do")
	public String modifyEmp( Model model ) {
		//DBMS에서 조회한 결과를 가진 객체
		EmpDomain ed = new EmpDomain();
		ed.setEmpno(0);
		ed.setEname("황충연");
		ed.setJob("사원");
		ed.setMgr(0);
		ed.setSal(0);
		ed.setComm(0);
		ed.setDeptno(10);
		
		model.addAttribute("empData", ed);
		
		
		return "day0517/emp_modify_frm"; 
	}
	

	@PostMapping("/emp_modify_process.do")
	public String modifyEmpProcess( EmpVO ev, Model model ) {
		//DBMS에서 조회한 결과를 가진 객체
		
		
		model.addAttribute("modifyFlag", es.modifyEmp(ev));
		
		
		return "day0517/emp_modify_process"; 
	}
	
	@PostMapping("/emp_remove_process.do")
	public String removeEmpProcess( @RequestParam(defaultValue = "1111", required = false) int empno, Model model ) {
		//DBMS에서 조회한 결과를 가진 객체
		
		
		model.addAttribute("removeFlag", es.removeEmp(empno));
		
		
		return "day0517/emp_remove_process"; 
	}


}
