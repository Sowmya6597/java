package com.arr;

public class Met {
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		sb.append("thijfdfghj");
		sb.insert(4,"sony");
		System.out.println(sb);
		sb.replace(3, 5, "sowmya");
		System.out.println(sb);
		sb.ensureCapacity(700);
        System.out.println(sb.capacity());
}
}
