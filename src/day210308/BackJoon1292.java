package day210308;
import java.util.Scanner;
import java.util.ArrayList;

public class BackJoon1292 {
	public static void main(String[] args) {
		int num=1;
		int count=0;
		ArrayList <Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<1000; i++) {
			arr.add(num);
			count++;
			if(num==count) {
				num++;
				count=0;
			}
		}
		
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum=0;
		
		for(int k=a; k<=b; k++) {
			sum+=arr.get(k-1);
		}
		System.out.println(sum);
	}
}
