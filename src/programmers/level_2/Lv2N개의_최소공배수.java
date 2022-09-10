package programmers.level_2;

import java.math.BigInteger;

public class Lv2N개의_최소공배수 {

    public static int solution(int[] arr) {
        int answer = 0;
        int tmp = arr[0];//2

        for (int i = 0; i < arr.length; i++) {
            int gcd = BigInteger.valueOf(arr[i]).gcd(BigInteger.valueOf(tmp)).intValue();//2
            int lcm = tmp * arr[i] / gcd;

            tmp = lcm;
        }

        System.out.println(tmp);
        return tmp;
    }

    public static void main(String[] args) {
        solution(new int[]{1,2,3});
    }

}
