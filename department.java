public class department {

	private int deptid;
	private String deptname;
	private int empid;

	public department() {
		super();
	}

	public department(int deptid, String deptname, int empid) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.empid = empid;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "department [deptid=" + deptid + ", deptname=" + deptname + ", empid=" + empid + "]";
	}
	
}
