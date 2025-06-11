package dev.srivatsan.employees_psql.controller;

import dev.srivatsan.employees_psql.entity.EmployeeTitle;
import dev.srivatsan.employees_psql.model.EmployeeRequest;
import dev.srivatsan.employees_psql.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/title")
public class EmployeeTitleController {

    private final EmployeeService employeeService;

    public EmployeeTitleController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/")
    public ResponseEntity<EmployeeTitle> getEmployeeTitleByID(@RequestBody EmployeeRequest request) {
        EmployeeTitle employeeTitleByID = employeeService.getEmployeeTitleByID(request.getEmpId(), request.getDeptId());
        return ResponseEntity.ok(new EmployeeTitle());

    }

}
