import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string text: ");// User writes a string 
        String text = scanner.nextLine();
        int strlength = text.length();        // Get string length

        while(strlength > 0);{
        	
        	
        	
        	
        	System.out.print(text.charAt(strlength -1));
        	
        	strlength--;
        }
        
        
        
        
        
      
        }
    }

