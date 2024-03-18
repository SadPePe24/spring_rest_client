package org.kissmepls.spring.rest.entity;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Employee
{

    private int id;


    private String name;


    private String surname;


    private String department;


    private int salary;


    public Employee()
    {

    }

    public Employee(String name, String surname, String department, int salary)
    {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
