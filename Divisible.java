import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input a number to see if divisible by 2 & 3");
		int num = scanner.nextInt();
		
		if(num% 2 == 0 && num% 3 ==0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
