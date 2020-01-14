package com.cts.activity.main;
import java.util.ArrayList;
public class Employee 
{
	public Employee(int i, String string, String string2, int j, long l, double d) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
	{
		ArrayList  <Employee> list=new ArrayList <Employee>();
		Employee e1=new Employee(101,"abc", "Hyd", 22, 837968767L, 82367788.00);
		Employee e2=new Employee(102,"def", "chennai", 20, 83792893L, 867788.00);
		Employee e3=new Employee(103,"ghi", "pune", 23, 837928L, 8267788.00);
		Employee e4=new Employee(104,"jkl", "Hyds", 24, 79289329L, 82367788.00);
		Employee e5=new Employee(105,"mno", "Hyder", 25, 837929329L, 867788.00);
		Employee e6=new Employee(106,"pqr", "Hydhk1", 26, 837928329L, 2367788.00);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		System.out.println(list.toString());
  }

}
