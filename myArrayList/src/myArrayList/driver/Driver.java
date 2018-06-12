package myArrayList.driver;

import java.io.IOException;

import myArrayList.myArrayList;
import myArrayList.util.FileProcessor;

public class Driver {
	
	public static void main(String[] args) throws IOException 
	{
			
		String abc=args[0];
		FileProcessor f=new FileProcessor(abc);
		myArrayList my=new myArrayList();
		Integer a=null;
		while((a=f.readline())!=null){
		my.insertSorted(a);
		}
		System.out.print(my.toString());
	}
}
