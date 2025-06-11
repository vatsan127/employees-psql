package dev.srivatsan.employees_psql.service;

import dev.srivatsan.employees_psql.entity.Employee;
import dev.srivatsan.employees_psql.entity.EmployeeTitle;
import dev.srivatsan.employees_psql.entity.EmployeeTitle_CPK;
import dev.srivatsan.employees_psql.exception.EmployeeNotFoundException;
import dev.srivatsan.employees_psql.repository.EmployeeRepo;
import dev.srivatsan.employees_psql.repository.EmployeeTitleRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final EmployeeTitleRepo employeeTitleRepo;

    public EmployeeService(EmployeeRepo employeeRepo, EmployeeTitleRepo employeeTitleRepo) {
        this.employeeRepo = employeeRepo;
        this.employeeTitleRepo = employeeTitleRepo;
    }

    public Employee getEmployeeById(long id) {
        Optional<Employee> optEmployee = employeeRepo.findById(id);
        return optEmployee.orElseThrow(EmployeeNotFoundException::new);
    }

    public EmployeeTitle getEmployeeTitleByID(long empId, long deptId) {
        Optional<EmployeeTitle> byEmpIdAndDeptId = employeeTitleRepo.findById(new EmployeeTitle_CPK(empId, deptId));
        return byEmpIdAndDeptId.orElseThrow(EmployeeNotFoundException::new);
    }
}
