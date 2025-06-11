package dev.srivatsan.employees_psql.repository;

import dev.srivatsan.employees_psql.entity.EmployeeTitle;
import dev.srivatsan.employees_psql.entity.EmployeeTitle_CPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeTitleRepo extends JpaRepository<EmployeeTitle, EmployeeTitle_CPK> {

}
