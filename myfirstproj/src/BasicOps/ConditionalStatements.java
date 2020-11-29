package BasicOps;
import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println(" Enter Y/N");
		char resp = s1.nextLine().charAt(0);
		if (resp == 'Y') {
			System.out.println("you entered yes");
		

		}
		else {
			System.out.println("you entered no");
		}
		s1.close();
	}

}
