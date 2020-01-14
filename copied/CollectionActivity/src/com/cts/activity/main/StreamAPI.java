package com.cts.activity.main;
import  com.cts.activity.bean.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
public static void main(String args[])
{
	List<Employee> employees=new ArrayList<Employee>();
	addEmployees(employees);
	//employees.forEach(System.out::println);
	List<Employee> agescale=employees.parallelStream().filter(emp->emp.getAge()>20 && emp.getAddress().equals("Hyd")).collect(Collectors.toList());
    System.out.println("Employees with more than 22 and Hyd");
    agescale.forEach(System.out::println);
    List<Employee> namescale=employees.parallelStream().filter(emp->emp.getName().length()>5).collect(Collectors.toList());
    System.out.println("Employees with more than 5 ");
    agescale.forEach(System.out::println);
    
}
private static void addEmployees(List<Employee> employees)
{
	Employee e1=new Employee(100,"Sony","Hyd",22,99128,500.00);
	Employee e3=new Employee(101,"abc", "Hyd", 22, 837968767L, 82367788.00);
	Employee e4=new Employee(102,"def", "chennai", 20, 83792893L, 867788.00);
	Employee e5=new Employee(103,"ghi", "pune", 23, 837928L, 8267788.00);
	employees.add(e1);
	employees.add(e3);
	employees.add(e4);
	employees.add(e5);
}
}