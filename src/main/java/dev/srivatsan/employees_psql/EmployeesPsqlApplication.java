package dev.srivatsan.employees_psql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeesPsqlApplication {

    /* ToDo:
     * 	 OneToOne (Unidirectional & BiDirectional)
     * 	 OneToMany (Unidirectional & BiDirectional)
     * 	 Swagger
     *   */

    public static void main(String[] args) {
        SpringApplication.run(EmployeesPsqlApplication.class, args);
    }

}
