package kr.co.sist.vo;

import java.sql.Date;

public class EmpVO {
	
	private int empno,mgr,sal,comm,deptno;
	private String ename,job;
	private Date hiredate;
	
	
	
	
	
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "EmpVO [empno=" + empno + ", mgr=" + mgr + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno
				+ ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate + "]";
	}
	
	
	
}//class
