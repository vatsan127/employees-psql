package dev.srivatsan.employees_psql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeTitle {

    @EmbeddedId
    private EmployeeTitle_CPK employeeTitleCPK;
    private String titleName;

    @OneToOne(mappedBy = "title")
    private Employee employee;

}
