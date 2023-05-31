package kr.co.sist.dao.day0516;

import org.apache.ibatis.session.SqlSession;

import kr.co.sist.dao.MyBatisHandler;

public class TestMyBatis2 {
	
	public static void main(String[] args) {
		
		MyBatisHandler mbh = MyBatisHandler.getInstance();
		
		SqlSession ss = mbh.getMyBatisHandler(false);
		System.out.println(ss);
	}

}
