package dev.srivatsan.employees_psql.controller;

import dev.srivatsan.employees_psql.entity.Employee;
import dev.srivatsan.employees_psql.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/emp")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        log.info("Incoming Request :: emp ID - {} ",id);
        Employee employeeById = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employeeById);
    }

}
