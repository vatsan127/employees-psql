package dev.srivatsan.employees_psql.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name = "employee_seq", sequenceName = "id_employee_seq", allocationSize = 25)
    private long id;
    private String firstName;
    private String lastName;
    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "emp_id", referencedColumnName = "emp_id"),
            @JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
    })
    private DepartmentDetails departmentDetails;

}
