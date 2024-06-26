package com.example.Employee.dto;

public class EmployeeDTO {
	
	private int employeeId;
	private String employeeName;
	private String email;
	private String password;
	private String designation;
	
	public EmployeeDTO(int employeeId, String employeeName, String email, String password, String designation) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.password = password;
		this.designation= designation;
	}
	
	public EmployeeDTO() {
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", password=" + password + ", designation=" + designation + "]";
	}

	
	
}
