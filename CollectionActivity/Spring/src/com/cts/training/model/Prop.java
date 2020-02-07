package com.cts.training.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Prop {
	public static void main(String args[]) throws IOException
	{
		/*
		 * Properties properties=new Properties(); FileInputStream fin=new
		 * FileInputStream("src/sample.properties.txt"); properties.load(fin);
		 * System.out.println("Username:"+properties.getProperty("username"));
		 */
		Properties p=System.getProperties();
		Set<Map.Entry<Object,Object>> set=p.entrySet();
		for(Map.Entry<Object,Object>entry:set)
		{
			System.out.println(entry.getKey()+"->" +entry.getValue());
		
		}
	

}
}
