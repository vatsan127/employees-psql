package dev.srivatsan.employees_psql.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeTitle_CPK implements Serializable {

    private long empId;
    private long deptId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTitle_CPK employeeTitleCPK = (EmployeeTitle_CPK) o;
        return empId == employeeTitleCPK.empId && deptId == employeeTitleCPK.deptId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, deptId);
    }
}