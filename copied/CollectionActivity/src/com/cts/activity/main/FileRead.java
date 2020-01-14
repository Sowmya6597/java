package com.cts.activity.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileRead {
	public static void main(String args[])throws IOException
	{
		String path="C:\\java1\\data.txt";
		FileInputStream fin=new FileInputStream(path);
		//FileOutputStream fout=new FileOutputStream("copied.txt");
		int i;
		while((i=fin.read()) != -1)
        {
			//fout.write(i);
			System.out.println((char)i);
        }
	fin.close();
	//fout.close();
        }
	}
