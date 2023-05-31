package kr.co.sist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sist.service.ProcedureService;
import kr.co.sist.vo.EmpInsertVO;

@Controller
public class ProcedureController {
	
	@Autowired(required = false)
	private ProcedureService ps;
	
	@PostMapping("/insert_procedure.do")
	public String insertProcess(EmpInsertVO eiVO, Model model) {
		
		ps.insertProc(eiVO);
		model.addAttribute("process_data", eiVO);
		
		return "day0523/insert_result";
	}//insertProcess
	

	@GetMapping("/procedure_all.do")
	public String searchAllCpEmp(Model model) {
		
		
		model.addAttribute("empList", ps.selectAllCpEmp() );
		
		return "day0523/all_cp_emp";
	}//insertProcess
	
	@PostMapping("/process_search.do")
	public String searchDeptCpEmp(int deptno, Model model) {
		
		
		model.addAttribute("empList", ps.selectDeptnoCpEmp(deptno) );
		
		return "day0523/all_cp_emp";
	}//insertProcess
	
	

}
