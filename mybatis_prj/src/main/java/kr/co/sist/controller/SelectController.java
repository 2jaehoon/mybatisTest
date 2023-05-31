package kr.co.sist.controller;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sist.service.SelectService;

@Controller
public class SelectController {
	@Autowired(required = false)
	private SelectService ss;
	
	//컬럼 하나에 한 행 조회
	@PostMapping("/scsr_process.do")
	public String scsr(int deptno, Model model) throws PersistenceException {
		
		model.addAttribute("dname", ss.scsr(deptno));
		
		
		return "day0517/scsr";
	}
	
	
	//컬럼 하나에 여러 행 조회
		@GetMapping("/scmr.do")
		public String scmr(Model model) {
			
			model.addAttribute("list", ss.scmr());
			
			
			return "day0517/scmr";
		}
		
		//컬럼 여러개에 한 행 조회
		@PostMapping("/dept_search.do")
		public String mcsr(int deptno, Model model) {
			
			model.addAttribute("dd", ss.mcsr(deptno));
			
			return "day0518/mcsr";
		}
		
		//컬럼 여러개에 여러 행 조회
				@PostMapping("/emp_search.do")
				public String mcmr(int deptno, Model model) {
					
					model.addAttribute("empList", ss.mcmr(deptno));
					
					return "day0518/mcmr";
				}
				
				//<의 사용
				@PostMapping("/lessthan.do")
				public String lessthan(int sal, Model model) {
					
					model.addAttribute("empList", ss.lessthan(sal));
					model.addAttribute("msg", sal+"보다 적게 받는 사원");
					
					return "day0518/lessthan";
				}
				
					//>의 사용
					@PostMapping("/greaterthan.do")
					public String greaterthan(int sal, Model model) {
						
						model.addAttribute("empList", ss.greaterthan(sal));
						model.addAttribute("msg", sal+"보다 높게 받는 사원");
						
						return "day0518/greaterthan";
					}
					
					//like의 사용
					@PostMapping("/like.do")
					public String like(String option, Model model) {
						
						model.addAttribute("carList", ss.like(option));
						model.addAttribute("msg", option+"으로 조회된 결과");
						model.addAttribute("msg2", "<strong>"+option+"</strong><br>");
						
						return "day0518/like";
					}
					
					
	

}
