package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class card1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		Queue<Integer> queue = new LinkedList<>();
		for (int card = 1; card <= n; card++)
			queue.offer(card);

		while(true){
			System.out.print(queue.poll() + " ");
			if(queue.isEmpty())	break;
			queue.add(queue.poll());
		} 
		
		sc.close();
	}
}