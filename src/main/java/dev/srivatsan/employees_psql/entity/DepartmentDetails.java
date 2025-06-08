package dev.srivatsan.employees_psql.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class DepartmentDetails {

    @EmbeddedId
    DepartmentDetails_CPK departmentDetails_cpk;
    private String deptName;

}
