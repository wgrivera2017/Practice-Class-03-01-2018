import java.util.Scanner;
public class string {

	public static boolean first(String z){

		int y = z.length();
		boolean l;
		if(y% 2 == 0) {
			l = true;
		}
		else {
			l = false;
		}
		return l;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a word");
		String y = scanner.nextLine();

		System.out.println(first(y));

	}

}
