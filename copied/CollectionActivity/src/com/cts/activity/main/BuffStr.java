package com.cts.activity.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BuffStr {
public static void main(String args[])throws IOException
{
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //String str=br.readLine();
    //System.out.println(str);
	FileWriter writer = new FileWriter("C:\\java1\\data.txt"); 
    BufferedWriter bw=new BufferedWriter(writer);
    bw.write("Welcome to javaTpoint.");  
    bw.close();  
    System.out.println("Success");  
    
}
}
