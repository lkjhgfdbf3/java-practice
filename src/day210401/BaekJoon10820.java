package day210401;
import java.util.*;

public class BaekJoon10820 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []num = new int[4];
		
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			int lower = 0;
			int upper = 0;
			int digit = 0;
			int space = 0;
			
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				if(ch>='a' && ch<='z') {
					lower+=1;
				}
				else if(ch>='A' && ch<='Z') {
					upper+=1;
				}
				else if(ch>='0' && ch<='9') {
					digit+=1;
				}
				else if(ch==' ') {
					space+=1;
				}
			}
			System.out.println(lower+" "+upper+" "+digit+" "+space);
		}
	}
}
