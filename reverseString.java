//Write a Java program to reverse a given string.*/
import java.util.Scanner; // Imports the scanner object from java.util

public class Main {
    public static void main(String[] args) { 
        
    	
    	String original = "", reversed = ""; 
    	Scanner scanner = new Scanner(System.in);
    	
    	while(!original.contains("Exit"))
        
    	{
    	
        original = "";
        reversed = "";
        System.out.println("Enter a string for which you want to be reversed: ");// User writes a string 
        //String text = scanner.nextLine(); // Gets stored 
        original = scanner.nextLine(); // The input from the user is stored 
        int length = original.length(); //
        int i;

        for(i = length - 1 ; i >= 0; i--) {
        reversed = reversed + original.charAt(i);
        System.out.println("Reversed string: " + reversed);

        }
        }
        
        
        }
    }

  
	  
	  

