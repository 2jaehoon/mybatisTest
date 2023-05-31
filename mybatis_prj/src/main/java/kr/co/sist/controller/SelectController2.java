package kr.co.sist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.service.SelectService;
import kr.co.sist.vo.CarSearchVO;

@Controller
public class SelectController2 {
	@Autowired(required = false)
	SelectService ss;
	
	@GetMapping("/subquery.do")
	public String subquery(Model model) {
		model.addAttribute("carList", ss.subquery());
		
		
		return "day0518/like";
	}
	
	@PostMapping("/where_search.do")
	public String where(@RequestParam(defaultValue = "-1") int deptno, Model model) {
		System.out.println("---------------------= " + deptno);
		model.addAttribute("empList", ss.dynamicWhere(deptno));
		return "day0519/where";
	}
	
	@PostMapping("/if_search.do")
	public String dynamicIf(CarSearchVO csVO, Model model) {
		model.addAttribute("carList", ss.dynamicIf(csVO));
		return "day0518/like";
	}
	
	@PostMapping("/choose_search.do")
	public String choose(int job, Model model) {
		model.addAttribute("empList", ss.dynamicChoose(job));
		return "day0519/where";
	}
	
	@PostMapping("/foreach_search.do")
	public String foreach(String[] job, Model model) {
		model.addAttribute("empList", ss.dynamicForeach(job));
		return "day0519/where";
	}
	
	
}
