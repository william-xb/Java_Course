package ch12;

import java.util.Scanner; 
import java.io.*;

public class ReadData {
  public static void main(String[] args) throws IOException  {
    // Create a File instance
    File file = new File("scores.txt");

    // Create a Scanner for the file with autoclose
    try(
    		Scanner input = new Scanner(file);
    	){
    		input.useDelimiter("[; ,|:\n\r\t]");
//    	    Read data from a file
    	    while (input.hasNext()) {
    		   String firstName = input.next();
    		   String mi = input.next();
    		   String lastName = input.next();
    		   int score = input.nextInt();
   		       System.out.print(input.nextLine());   
    		   System.out.println(
    				firstName + " " + mi + " " + lastName + " " + score);
    	}
    }


    

    // Close the file
    //input.close();
  }
}
