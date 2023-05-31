package kr.co.sist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sist.service.SelectService2;

@Controller
public class SelectController4 {
	@Autowired(required = false)
	private SelectService2 ss2;
	
	@GetMapping("/union.do")
	public String union(Model model) {
		model.addAttribute("empData", ss2.useUnion());
		
		return "day0522/union";
	}//union
	
	@GetMapping("/seachAllMaker.do")
	public String seachAllMaker(Model model) {
		model.addAttribute("maker", ss2.searchAllMaker());
		
		return "day0522/maker_frm";
	}//seachAllMaker
	
	@GetMapping("/search_model.do")
	public String seachSelectModel(String[] maker, Model model) {
		model.addAttribute("makerList", ss2.useJoin(maker));
		
		return "day0522/join";
	}//seachSelectModel
	
	@GetMapping("/join_subquery.do")
	public String searchSubqueryJoin(String[] maker, Model model) {
		model.addAttribute("makerList", ss2.useJoinSubQuery(maker));
		
		return "day0522/join";
	}//searchSubqueryJoin
	
	@GetMapping("/dynamic_table.do")
	public String dynamicTable(String dynamic_tab, Model model) {
		
		model.addAttribute("empData", ss2.useDynamicTable(dynamic_tab));
		return "day0522/union";
	}//dynamicTable


	
	
}
