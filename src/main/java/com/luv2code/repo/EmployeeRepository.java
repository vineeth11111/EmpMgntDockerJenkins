package com.luv2code.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
