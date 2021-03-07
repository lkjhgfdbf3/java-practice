package day210307;
import java.util.Scanner;
import java.util.Arrays;

public class BackJoon2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[9];
		int total=0;
		boolean check = false;
		
		for(int i=0; i<=8; i++) {
			int a = sc.nextInt();
			array[i]=a;
			total+=array[i];
		}
		
		for(int j=0; j<=8; j++) {
			if(check) break;
			for(int k=0; k<=8; k++) {
				if(j==k) continue;
				if(total-array[k]-array[j]==100) {
					array[k]=0;
					array[j]=0;
					check=true;
					break;
				}
			}
		}
		Arrays.sort(array);
		for(int g=2; g<=8; g++) {
			System.out.println(array[g]);
		}
	}
}
