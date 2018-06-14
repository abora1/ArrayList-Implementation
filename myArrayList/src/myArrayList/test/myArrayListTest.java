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
		testcase1();
		testcase2();
		testcase3();
	    testcase10();
		
		
	}
	public void testcase1(){
		boolean check;
		if(myAL.size()==0){
			check=true;
		}
		else{
			check=false;
		}
		res.storeNewResult("TEST CASE 1");
		res.storeNewResult("\nChecking if The array is empty Initially returns result : "+check);
		
	}
	public void testcase2(){
		res.storeNewResult("\n TEST CASE 2");
		boolean c1;
		myAL.insertSorted(123);
		myAL.insertSorted(1233434);
		myAL.insertSorted(322);
		myAL.insertSorted(33);
		myAL.insertSorted(-324);
		if(myAL.size()==3)
		{
			c1=true;
		}
		else{
			c1=false;
		}
		res.storeNewResult("\nTrying insertion with some out of order inputs and checking the final size to ensure returns : " +c1 );
	}
	public void testcase3(){
		boolean c2;
		res.storeNewResult("\n TEST CASE 3");
		myAL.insertSorted(2345);
		myAL.insertSorted(2323);
		myAL.insertSorted(4445);
		int x=0;
		x=myAL.indexOf(2345);
		if(x>=0){
			c2=true;
		}
		else{
			c2=false;
		}
		res.storeNewResult("\nTrying inserting Values and Finding index of a value returns :"+c2);
		res.storeNewResult("\n The index of value 2345 is :" +x);
	}
	public void testcase10() {
		Integer i = null; 
		try{ 
			do { 
				i = fp.readline(); 
				if (i != null) 
				{
					myAL.insertSorted(i);
				}
		   
			} while (i!= null);
			res.storeNewResult("\n TEST CASE 10");
			res.storeNewResult("\nChecking Input file with result : True"  +" Values Within The Bound were Inserted in The Array");
			res.storeNewResult("\nThe sum of all valid values in Input File : " +myAL.sum());
			res.storeNewResult("\nSize of The Array is :" +myAL.size()+"\n");
		}
	catch(Exception ex){
		System.out.println("Error in insertion of data."); 
		res.storeNewResult("Test case 10 checking Input file with result : False");
		res.storeNewResult("Error In Insertion Of data");
	}

	}
}