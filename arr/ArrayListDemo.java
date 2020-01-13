package com.arr;
import java.util.ArrayList;
public class ArrayListDemo 
{
	public static void main(String args[])
	{
		ArrayList  <Arr> list=new ArrayList <Arr>();
		Arr e1=new Arr(101,"abc", "Hyd", 22, 837968767L, 82367788.00);
		Arr e2=new Arr(102,"def", "chennai", 20, 83792893L, 867788.00);
		Arr e3=new Arr(103,"ghi", "pune", 23, 837928L, 8267788.00);
		Arr e4=new Arr(104,"jkl", "Hyds", 24, 79289329L, 82367788.00);
		Arr e5=new Arr(105,"mno", "Hyder", 25, 837929329L, 867788.00);
		Arr e6=new Arr(106,"pqr", "Hydhk1", 26, 837928329L, 2367788.00);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		System.out.println(list.toString());
  }

}
