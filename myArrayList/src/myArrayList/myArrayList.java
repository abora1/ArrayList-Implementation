package myArrayList;

import java.util.Arrays;

public class myArrayList {
	private static int counter=0;
	private int[] arr=new int[50];
	
public myArrayList(){
	arr=new int[50];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=973248;
	}
	
}
public void insertSorted(int number){
	if(number<=10000)
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
	}

public void removeValue(int value){
	for(int i=0;i<counter;i++)
	{
		if(arr[i]==value)
		{
			arr[i]=973248;
			counter--;
		}
		
}Arrays.sort(arr);
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
}