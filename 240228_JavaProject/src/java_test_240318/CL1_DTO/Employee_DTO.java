package java_test_240318.CL1_DTO;

import java.util.HashMap;
import java.util.Map;

public class Employee_DTO {
	
	private int employeeNum;
	private String employeeName;
	private String employeeDEPT;
	private String employeePwd;
		
	public Employee_DTO(int employeeNum, String employeeName,
						String employeeDEPT, String employeePwd) {
		this.employeeNum = employeeNum;
		this.employeeName = employeeName;
		this.employeeDEPT = employeeDEPT;
		this.employeePwd = employeePwd;
	}


	
	public int getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDEPT() {
		return employeeDEPT;
	}

	public void setEmployeeDEPT(String employeeDEPT) {
		this.employeeDEPT = employeeDEPT;
	}

	public String getEmployeePwd() {
		return employeePwd;
	}

	public void setEmployeePwd(String employeePwd) {
		this.employeePwd = employeePwd;
	}
	
}
