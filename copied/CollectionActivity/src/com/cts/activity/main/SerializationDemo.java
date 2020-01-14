package com.cts.activity.main;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.cts.activity.bean.Employee;
public class SerializationDemo {
	public static Object deserialize(String fileName) {
    return null;
}
	public static Object serialize(Object obj,String fileName)throws IOException
	{
		FileOutputStream fout=new FileOutputStream(fileName);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		ObjectOutputStream out=new ObjectOutputStream(bout);
		out.writeObject(obj);
		bout.close();
		fout.close();
		out.close();
		return obj;
	}
public static void main(String args[])throws ClassNotFoundException,IOException
{
Employee employee=new Employee(100,"ddd","ggg",34,688659595,990.00);
try {
	serialize(employee,"serial111.txt");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}
}


