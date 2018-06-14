package myArrayList.driver;

import java.io.IOException;

import myArrayList.myArrayList;
import myArrayList.test.myArrayListTest;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;

public class Driver {
	
	public static void main(String[] args) throws IOException 
	{
			
		String abc=args[0];
		String abc1=args[1];
		FileProcessor fp=new FileProcessor(abc);
		myArrayList my=new myArrayList();
		Results rs=new Results();
		myArrayListTest test1=new myArrayListTest(fp);
		test1.testme(my,rs);
		rs.writeToStdout();
		rs.writeToFile(abc1);
		fp.fileclose();
		/*Integer a=null;
		while((a=f.readline())!=null){
		my.insertSorted(a);
		}
		System.out.print(my.toString());*/
	}
}
