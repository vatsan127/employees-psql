package dev.srivatsan.employees_psql.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToOne(mappedBy = "title", fetch = FetchType.LAZY)
    private Employee employee;

}
