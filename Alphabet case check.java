// Alphabet case check

import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first string: ");
		char ch  = scanner.next().trim().charAt(0);
		//scanner.nextLine
		if(Character.isLowerCase(ch)) {
			System.out.println(ch + " is a lower case letter");
			
		} else {
				
			System.out.println(ch + " is a upper case letter");
			}
			
			
			
		}
		
				
			
		
		
		
		
		}
	

		
	

	
