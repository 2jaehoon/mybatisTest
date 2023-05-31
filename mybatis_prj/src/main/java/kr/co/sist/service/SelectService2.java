package kr.co.sist.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.day0522.SelectDAO4;
import kr.co.sist.domain.CarDomain;
import kr.co.sist.domain.EmpDomain;

@Component
public class SelectService2 {

	@Autowired(required = false)
	SelectDAO4 sdDAO4;
	
public List<EmpDomain> useUnion(){
	List<EmpDomain> ed = null;
	
	ed=sdDAO4.union();
	
	return ed;
}//useUnion

public List<String> searchAllMaker(){
	List<String> listMaker = null;
	
	listMaker=sdDAO4.selectAllMaker();
	
	return listMaker;
}//useUnion

public List<CarDomain> useJoin( String[] maker ){
	List<CarDomain> listMaker = null;
	
	HashMap hm = new HashMap();
	hm.put("maker", maker);
	listMaker=sdDAO4.join(hm);
	
	return listMaker;
}//useUnion

public List<CarDomain> useJoinSubQuery( String[] maker ){
	List<CarDomain> listMaker = null;
	
	HashMap hm = new HashMap();
	hm.put("maker", maker);
	hm.put("startNum", 1);
	hm.put("endNum", 10);
	
	listMaker=sdDAO4.joinSubQuery(hm);
	
	return listMaker;
}//useJoinSubQuery


public List<EmpDomain> useDynamicTable(String tName){
	List<EmpDomain> ed = null;
	
	ed=sdDAO4.dynamicTable(tName);
	
	return ed;
}//useDynamicTable

}//class
