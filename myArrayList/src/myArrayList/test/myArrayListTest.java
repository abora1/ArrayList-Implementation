package myArrayList.test;

import myArrayList.myArrayList;
import myArrayList.util.Results;
import myArrayList.util.FileProcessor;

public class myArrayListTest {
	FileProcessor fp = new FileProcessor();
	 Results res=new Results();
	myArrayList myAL = new myArrayList();

	public myArrayListTest(FileProcessor fp) {
		this.fp = fp;
	}

	public void testme(myArrayList myAL, Results res) {
		this.myAL = myAL;
		this.res = res;
		boolean res1 = testcase1();
		res.storeNewResult("Test case to check input file with result" + res1);

	}

	public boolean testcase1() {
		Integer i = null; 
		try{ 
			do { 
				i = fp.readline(); 
				if (i != null) 
				{
					myAL.insertSorted(i);
				}
		   
			} while (i!= null); return true; 
		}
	catch(Exception ex){
		System.out.println("Error in insertion of data."); return false; }

	}
}