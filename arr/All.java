package com.arr;

public class All 
{ 
 public static void main(String args[])
 {
	 String st="Global Warming";
	 System.out.println(st.substring(10));
	 System.out.println(st.substring(4,8));
	 System.out.println(st.matches("[A-Za-z0-9]+"));
	 System.out.println(st.substring(4));
	 System.out.println(st.substring(0,st.length()- 4));
	 System.out.println(st.indexOf("Wa"));
	 System.out.println(st.replace('a','*'));
 }
}
