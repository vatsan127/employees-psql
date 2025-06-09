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
    @JoinColumn(name = "deptId", referencedColumnName = "deptId")
    private Department department;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "id", referencedColumnName = "empId", insertable = false, updatable = false),
            @JoinColumn(name = "deptId", referencedColumnName = "deptId", insertable = false, updatable = false)
    })
    private EmployeeTitle title;

}
