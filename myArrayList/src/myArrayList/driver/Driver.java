package myArrayList.driver;

import java.io.IOException;

import myArrayList.myArrayList;
import myArrayList.test.myArrayListTest;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;

public class Driver {

	public static void main(String[] args) throws IOException {

		if(args.length!=2)
		{
			System.out.println("Please Enter Both Input and Output Files");
			System.exit(0);
		}
		String abc = args[0];
		String abc1 = args[1];
		FileProcessor fp = new FileProcessor(abc);
		Results rs = new Results();
		myArrayList my = new myArrayList(rs);
		
		myArrayListTest test1 = new myArrayListTest(fp);
		test1.testme(my, rs);
		rs.writeToStdout();
		rs.writeToFile(abc1);
		fp.fileclose();
	}
}
