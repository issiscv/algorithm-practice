package programmers.level_2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Lv2N개의_최소공배수 {

    public static int solution(int[] arr) {
        int answer = 0;

        int tmp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int gcd = BigInteger.valueOf(arr[i]).gcd(BigInteger.valueOf(tmp)).intValue();
            int lcm = tmp * arr[i] / gcd;
            System.out.println(lcm);
            tmp = lcm;
        }

        System.out.println(tmp);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        solution(arr);
    }

}
