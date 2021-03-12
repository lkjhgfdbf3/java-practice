package day210312;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1789 {
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());

        System.out.println(solve(S));
    }

    static int solve(long n) {
        long sum = 0;
        int addNum = 1;
        while(n >= sum) {
            sum += addNum++;
        }
        return sum == n ? addNum - 1 : addNum - 2;
    }
}
