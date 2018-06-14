package myArrayList;

import java.util.Arrays;

import myArrayList.util.Results;

public class myArrayList {
	private static int counter=0;
	private int[] arr=new int[50];
	Results rs1=new Results();
	public myArrayList(){
		arr=new int[50];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=973248;
		}
	}
public myArrayList(Results rs1){
	this.rs1=rs1;
	arr=new int[50];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=973248;
	}
	
}
public void insertSorted(int number){
	if( number <= 10000 && number >=0)
	{
	if(counter<arr.length){
		arr[counter]=number;
		counter++;
		Arrays.sort(arr);
		
	}
	else{
		int x=arr.length;
		int[] arr1=new int[(int) Math.floor(x+x/2)];
		for(int p=0;p<arr.length;p++)
		{
			arr1[p]=arr[p];
		}
		arr=arr1;
		for(int i=x;i<arr.length;i++)
		{
			arr[i]=973248;
		}
		arr[counter]=number;
		counter++;
		Arrays.sort(arr);
	}
	}
	else{
		rs1.storeNewResult("\nNumber Out Of Bound :" +number);
	}
	}

public void removeValue(int value){
	if( value <= 10000 && value >=0)
	{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==value)
		{
			arr[i]=973248;
			counter--;
			
		}
		
	}
	Arrays.sort(arr);
	}
	else{
		rs1.storeNewResult("\nvalue to be deleted Out Of Bound :" +value);
	}
}
public int sum()
{
int sum=0;
for(int q=0;q<counter;q++)
{
	sum+=arr[q];
}
return sum;
}
public int indexOf(int x)
{
	for(int z=0;z<counter;z++)
	{
		if(arr[z]==x)
		{
			return z;
		}
	}
	return -1;
	}
public int size(){
	return counter;
}
@Override
public String toString() {

	System.out.print("The Elements in array are as follows:");
	for(int i=0;i<counter;i++)
	{
		System.out.print("\n"+arr[i]);
	}
	return null;
	
}
public void clean()
{
for(int i=0;i<arr.length;i++)
{
arr[i]=	973248;
counter=0;
}
}
}