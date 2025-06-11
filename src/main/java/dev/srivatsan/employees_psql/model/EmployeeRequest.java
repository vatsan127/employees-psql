package dev.srivatsan.employees_psql.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeRequest {
    private int empId;
    private int deptId;
}
