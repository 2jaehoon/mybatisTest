package kr.co.sist.domain;

public class DeptDomain {
	private int deptno;
	private String dname, location;
		
	
	
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}



	@Override
	public String toString() {
		return "DeptDomain [deptno=" + deptno + ", dname=" + dname + ", location=" + location + "]";
	}
	
	

}
