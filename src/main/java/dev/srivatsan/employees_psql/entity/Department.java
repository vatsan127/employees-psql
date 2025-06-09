package dev.srivatsan.employees_psql.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Department {
    @Id
    private int deptId;
    private int deptName;
}
