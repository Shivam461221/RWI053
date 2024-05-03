package com.example.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.dto.EmployeeDTO;
import com.example.Employee.dto.LoginDTO;
import com.example.Employee.entity.Employee;
import com.example.Employee.repo.EmployeeRepo;
import com.example.Employee.response.LoginResponse;
import com.example.Employee.services.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired(required = true)
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		String id = employeeService.addEmployee(employeeDTO);
		return id;
	}
	
	@PostMapping("/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
	
	@GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id){
		return employeeRepo.findById(id).orElse(null);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeRepo.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updateEmployee) {
		Employee employee = employeeRepo.findById(id).orElse(null);
        if (employee != null) {
        	employee.setEmployeeName(updateEmployee.getEmployeeName());
        	employee.setEmail(updateEmployee.getEmail());
        	employee.setPassword(updateEmployee.getPassword());
        	employee.setDesignation(updateEmployee.getDesignation());
            return employeeRepo.save(employee);
        }
        return null;
	}
}
