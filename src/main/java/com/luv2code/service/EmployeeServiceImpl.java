package com.luv2code.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luv2code.entity.Employee;
import com.luv2code.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepo;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

    @Override
    public Employee createEmployee(Employee employee) {
    	employeeRepo.save(employee);
        return employee;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
       
        return updatedEmployee;
    }

    @Override
    public void deleteEmployee(Long id) {
    	employeeRepo.deleteById(id);
    }
}

