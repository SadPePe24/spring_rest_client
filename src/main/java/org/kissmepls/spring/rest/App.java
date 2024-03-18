package org.kissmepls.spring.rest;

import org.kissmepls.spring.rest.configuration.MyConfig;
import org.kissmepls.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(89);
//        System.out.println(empById);

//        Employee emp = new Employee("Svyatogor", "Russich", "Priest", 666);
//        emp.setId(103);
//        communication.saveEmployee(emp);

//        communication.deleteEmployee(102);
    }
}
