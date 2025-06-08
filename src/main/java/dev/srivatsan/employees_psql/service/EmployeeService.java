package dev.srivatsan.employees_psql.service;

import dev.srivatsan.employees_psql.entity.Employee;
import dev.srivatsan.employees_psql.exception.EmployeeNotFoundException;
import dev.srivatsan.employees_psql.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;


    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee getEmployeeById(long id) {
        Optional<Employee> optEmployee = employeeRepo.findById(id);
        return optEmployee.orElseThrow(EmployeeNotFoundException::new);
    }
}
