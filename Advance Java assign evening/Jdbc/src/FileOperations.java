
import java.io.DataInputStream;
import java.io.File;  // Import the File class
import java.io.FileInputStream;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random; 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileOperations {
	
	public static void main(String[] args) throws IOException {

		
		try{    
            FileOutputStream fout=new FileOutputStream("C:\\Users\\hp\\eclipse-workspace\\Jdbc\\src\\random.txt.txt");    
            String s="25 53 643 745 8586 856 858.";    
            byte b[]=s.getBytes();//converting string into byte array    
            
            // inserting into text file
            fout.write(b);    
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}    
         
		
		List<Integer> list=new ArrayList<Integer>();
		String strFilePath = "C:\\Users\\hp\\eclipse-workspace\\Jdbc\\src\\\\random.txt.txt";
		   
		//reading from file
	    try
	    {
	       FileInputStream fin = new FileInputStream(strFilePath);
	       DataInputStream din = new DataInputStream(fin);
	      
	       int i = din.readInt();
	       
	       System.out.println("int : " + i);
	       if(i%5==0)
	       {
	    	   //multiple multiples of 5 by 2
	    	   list.add(2*i);
	       }
	    
	       din.close();
	       
	    }
	    catch(FileNotFoundException fe)
	    { 
	      System.out.println("FileNotFoundException : " + fe);
	    }
	    catch(IOException ioe)
	    {
	      System.out.println("IOException : " + ioe);
	    }
	    
	
	  }
}
