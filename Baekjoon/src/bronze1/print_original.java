package bronze1;

import java.util.Scanner;

public class print_original {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		
		sc.close();
	}
}
