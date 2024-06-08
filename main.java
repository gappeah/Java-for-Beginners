import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first whole number: ");
		int a = scanner.nextInt();
		
		System.out.println("Enter your second whole number: ");
		int b = scanner.nextInt();
		
		System.out.println("Enter your third whole number: ");
		int c = scanner.nextInt();
		
		int max = a;
		if (max < b) {
			max = b;
		}
		
		if (max < c) {
			max = c;
			
		}
		System.out.println(max);
		
				
			
		}
		
		
		
		}
	

		
	
