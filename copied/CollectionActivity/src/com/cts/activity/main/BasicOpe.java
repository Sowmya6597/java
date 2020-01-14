package com.cts.activity.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicOpe {
	public static void main(String args[])throws IOException
	{
		//FileSystem fs=FileSystems.getDefault();
		//Path path=fs.getPath("C:","java1","Users","lenovo","Desktop","Java");
		Path path= Paths.get("C:","java1","a");
		//System.out.println("New count :"+path.getNameCount());
		//Path path=Paths.get("C:","java1","Users","lenovo","Desktop","Java");
		//System.out.println("Is Absolute :"+path.isAbsolute());
		//System.out.println("Name on index 3:"+path.getName(3));
		//String path="C:\\java1\\data.txt";
		Files.createDirectory(path);
		
	}
}



