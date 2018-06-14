package myArrayList.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
	public FileProcessor(){}
	private BufferedReader br=null;
	
	public FileProcessor(String input) {
		try{
			File f=new File(input);
			br=new BufferedReader(new FileReader(f));
			
		}
		catch(Exception e){
		System.out.println("No file Found");
		e.printStackTrace();
		System.exit(0);
		}
			
	}
	
	public Integer readline() throws IOException {
		try{
			String s = null;
		while((s = br.readLine())!=null){
			Integer line=Integer.parseInt(s);
			return line;
		}
		}
		catch(IOException e){
			System.out.println("File cannot be Fetched");
			e.printStackTrace();
			System.exit(0);
		}
		catch(Exception e){
			System.out.println("exception occured while parsing file");
			e.printStackTrace();
			System.exit(0);
		}
		return null;	
	}
	public void fileclose()
	{
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
