package com.cg.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.spring.dto.Employee;

@Repository("employeedao") // Making the DAO into a repository
public class EmployeeDaoImpl implements EmployeeDao { // interacts with the database

	@Autowired // injecting bean automatically
	@PersistenceContext // to make db specific operation
	EntityManager entityManager;

	@Override
	public void addEmployee(Employee e) {

		entityManager.persist(e); // to add employee details to the database
	}

	@Override
	public List<Employee> showEmployees() {

		List<Employee> list = new ArrayList<Employee>();
		Query q = entityManager.createQuery("from Employee"); // returns resultSet list
		list = q.getResultList();
		return list;
	}
	
	public void deleteEmployees(int id) {

	Query q= entityManager.createQuery("from Employee where emp_id=:id");
	q.setParameter("id", id);
	Employee e=(Employee) q.getSingleResult();
	entityManager.remove(e);
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		entityManager.merge(e);
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee empList =	entityManager.find(Employee.class, id);
		return empList;
	}

	
	
	
}
