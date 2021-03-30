package day210330;
import java.util.*;

public class BaekJoon10866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		
		for(int k=0; k<num; k++) {
			String line = sc.nextLine();
			String[] s = line.split(" ");
			String str = s[0];
			if(str.equals("push_front")) {
				int n = Integer.parseInt(s[1]);
				deque.offerFirst(n);
			}
			else if(str.equals("push_back")) {
				int n = Integer.parseInt(s[1]);
				deque.offerLast(n);
			}
			else if(str.equals("pop_front")) {
				if(deque.isEmpty())
					System.out.println("-1");
				deque.pollFirst();
			}
			else if(str.equals("pop_back")) {
				if(deque.isEmpty())
					System.out.println("-1");
				deque.pollLast();
			}
			else if(str.equals("size")) {
					System.out.println(deque.size());
			}
			else if(str.equals("empty")) {
				if(deque.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
			}
			else if(str.equals("front")) {
				if(deque.isEmpty())
					System.out.println("-1");
				System.out.println(deque.peekFirst());
			}
			else if(str.equals("back")) {
				if(deque.isEmpty())
					System.out.println("-1");
				System.out.println(deque.peekLast());
			}
		}
	}
}
