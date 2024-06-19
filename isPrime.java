import java.util.Scanner;
public class Main {
public static void main(String[] args) {

csharp
Copy code
  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter a number ");
  int num = scanner.nextInt();
  for (int i=1; i<num; i++) {
	  if (num % i == 0) {
		   
		 System.out.println("This number " + num + " is Prime");
			 
	  } else {
		System.out.println("This number " + num + " is not a prime");
	  
	  }
	  
  }
  

  
  }
	 
	  	  
  }

  
	  
	  
