package myArrayList.test;

import java.util.ArrayList;

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
		testcase4();
		testcase5();
		testcase6();
		testcase7();
		testcase8();
		testcase9();
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
		res.storeNewResult("****************TEST CASE 1********************");
		res.storeNewResult("\nChecking if The array is empty Initially returns result : "+check);
		
	}
	public void testcase2(){
		res.storeNewResult("\n****************TEST CASE 2********************");
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
		res.storeNewResult("\nTrying insertion with some out of order inputs and checking the final size to ensure bound.Test case returns : " +c1 );
	}
	public void testcase3(){
		boolean c2;
		res.storeNewResult("\n****************TEST CASE 3********************");
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
		res.storeNewResult("\nTrying inserting Values and Finding index of a value.Test case returns :"+c2);
		res.storeNewResult("\n The index of value 2345 is :" +x);
	}
	public void testcase4(){
		res.storeNewResult("\n****************TEST CASE 4********************");
		boolean c3;
		myAL.insertSorted(5787);
		myAL.insertSorted(5787);
		myAL.insertSorted(5787);
		myAL.insertSorted(5787);
		myAL.insertSorted(6000);
		myAL.removeValue(5787);
		int x=myAL.indexOf(5787);
		if(myAL.indexOf(5787)==-1)
		{
			c3=false;
		}
		else{
			c3=true;
		}
		res.storeNewResult("\nTrying inserting Value(5787) multiple times and deleting same value and checking index(If index returns -1 then value is not in the array).Test case returns :"+c3);
		res.storeNewResult("\nFalse means after deletion no copy of same value resides in memory");
	}
	public void testcase5(){
		res.storeNewResult("\n****************TEST CASE 5********************");
		boolean c4;
		try{
			myAL.removeValue(99999);
			c4=false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			c4=true;
		}
		res.storeNewResult("\n Trying to delete a value that is out of bound.Test case returns :"+c4);
	}
	public void testcase6(){
		res.storeNewResult("\n****************TEST CASE 6********************");
		boolean c5;
		for(int i=0;i<100;i++)
		{
			myAL.insertSorted((int)(Math.random()*100));
		}
		if(myAL.size()>=75){
			c5=true;
		}
		else{
			c5=false;
		}
		res.storeNewResult("\nInserting 100 values in array to check if array size increases dynamically.Test case returns :"+c5);
		res.storeNewResult("\ntotal size is :"+myAL.size());
	}
	public void testcase7(){
		res.storeNewResult("\n****************TEST CASE 7********************");
		boolean c6;
		int x1,x2,x3;
		x1=myAL.size();
		myAL.insertSorted(9876);
		myAL.insertSorted(9654);
		myAL.insertSorted(9000);
		x2=myAL.size();
		myAL.removeValue(9876);
		myAL.removeValue(9654);
		myAL.removeValue(9000);
		x3=myAL.size();
		if(x1==x3){
			c6=true;
		}
		else{
			c6=false;
		}
		res.storeNewResult("\nAdding and removing 3 unique values and checking size to check if add and remove values work properly.Test result gives :"+c6);
		res.storeNewResult("\nvalues inserted and deleted : 9876,9654,9000 ");
		res.storeNewResult("\nSize Before and After Insertion :"+x1+", "+x2+ " and After Deletion :"+x3);
	}
	public void testcase8(){
		res.storeNewResult("\n****************TEST CASE 8********************");
		boolean c7;
		int x1,x2,x3;
		x1=myAL.sum();
		myAL.insertSorted(500);
		myAL.insertSorted(300);
		myAL.insertSorted(200);
		x2=myAL.sum();
		myAL.removeValue(500);
		myAL.removeValue(300);
		myAL.removeValue(200);
		x3=myAL.sum();
		if(x1==x3){
			c7=true;
		}
		else{
			c7=false;
		}
		res.storeNewResult("\nAdding and removing 3 unique values and checking sum to check if add and remove values work properly and sum calculates latest values.Test result gives :"+c7);
		res.storeNewResult("\nvalues inserted and deleted : 500,300,200 ");
		res.storeNewResult("\nSum Before and After Insertion :"+x1+", "+x2+ " and After Deletion :"+x3);
	}
	public void testcase9(){
		res.storeNewResult("\n****************TEST CASE 9********************");
		boolean c8;
		myAL.clean();  //clearing out the array
		if(myAL.size()==0)
		{
			c8=true;
		}
		else{
			c8=false;
		}
		res.storeNewResult("\nEmptying the Array and checking the size.Test case returns :" +c8 +" and size of array is :" +myAL.size());
	}
	public void testcase10() {
		final ArrayList resList1 = new ArrayList();
		Integer i = null; 
		try{ 
			do { 
				i = fp.readline(); 
				if (i != null) 
				{
					myAL.insertSorted(i);
					resList1.add(i);
				}
		   
			} while (i!= null);
			res.storeNewResult("\n****************TEST CASE 10********************");
			res.storeNewResult("\nChecking Input file with result : True"  +" Values Within The Bound were Inserted in The Array");
			res.storeNewResult("\nThe sum of all valid values in Input File : " +myAL.sum());
			res.storeNewResult("\nSize of The Array is :" +myAL.size());
			res.storeNewResult("\n Valid numbers in the file are");
			res.storeNewResult(""+resList1);
		}
	catch(Exception ex){
		System.out.println("Error in insertion of data."); 
		res.storeNewResult("Test case 10 checking Input file with result : False");
		res.storeNewResult("Error In Insertion Of data");
	}

	}
}