package dev.srivatsan.employees_psql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@Embeddable
@NoArgsConstructor
public class DepartmentDetails_CPK implements Serializable {

    @Column(name = "emp_id")
    private long empId;

    @Column(name = "dept_id")
    private String deptId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentDetails_CPK that = (DepartmentDetails_CPK) o;
        return empId == that.empId && Objects.equals(deptId, that.deptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, deptId);
    }

}
