package com.cg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.EmployeeDao;
import com.cg.spring.dto.Employee;

@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeDao employeedao;   //refer to the interface of DAO
	
	
	@Override
	public void addEmployee(Employee e) {
	
		employeedao.addEmployee(e);
	}

	@Override
	public List<Employee> showEmployees() {
	
		return employeedao.showEmployees();
	}

	@Override
	public void deleteEmployees(int id) {
		employeedao.deleteEmployees(id);
	}
	@Override
	public Employee searchEmployee(int id) {
		
		return employeedao.searchEmployee(id);
	}


	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
	employeedao.updateEmployee(e);	
	}


	

}
