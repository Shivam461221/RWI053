package com.example.Employee.services;

import com.example.Employee.dto.EmployeeDTO;
import com.example.Employee.dto.LoginDTO;
import com.example.Employee.response.LoginResponse;

public interface EmployeeService {


	public String addEmployee(EmployeeDTO employeeDTO);
//	{
//
//		Employee employee = new Employee(employeeDTO.getEmployeeId(), employeeDTO.getEmployeeName(),
//				employeeDTO.getEmail(), this.passwordEncoder.encode(employeeDTO.getPassword()),
//				employeeDTO.getDesignation());
//		employeeRepo.save(employee);
//		return employee.getEmployeeName();
//	}

	public LoginResponse loginEmployee(LoginDTO loginDTO);
//	{
//		String msg = "";
//		Employee employee1 = employeeRepo.findByEmail(loginDTO.getEmail());
//		if (employee1 != null) {
//			String password = loginDTO.getPassword();
//			String encodedPassword = employee1.getPassword();
//			Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
//			if (isPwdRight) {
//				Optional<Employee> employee = employeeRepo.findOneByEmailAndPassword(loginDTO.getEmail(),
//						encodedPassword);
//				if (employee.isPresent()) {
//					return new LoginResponse("Login Success", true);
//				} else {
//					return new LoginResponse("Login Failed", false);
//				}
//			} else {
//				return new LoginResponse("password Not Match", false);
//			}
//		} else {
//			return new LoginResponse("Email not exits", false);
//		}
//	}

}
