package com.cts.activity.main;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	public static void main(String args[])throws IOException
	{
		String path="C:\\java1\\data.txt";
		File file=new File(path);
		System.out.println("Can Execute?:"+file.canExecute());
		System.out.println("Can Read? : "+file.canRead());
		System.out.println("Can Write? : "+file.canWrite());
		System.out.println("Can Exists? : "+file.exists());
		System.out.println("Absolute path? : "+file.getAbsolutePath());
		System.out.println("File name: "+file.getName());		
		FileOutputStream fout=new FileOutputStream(path,true);
		Scanner sc=new Scanner(System.in);
		String msg=sc.nextLine();
		byte [] b=msg.getBytes();
		fout.write(b);
		fout.close();
	}

}
