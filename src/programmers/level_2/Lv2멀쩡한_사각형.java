package programmers.level_2;

import java.math.BigInteger;

public class Lv2멀쩡한_사각형 {

    public static long solution(int w, int h) {
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        return ((long) w * (long) h) - ((long)w + (long)h - (long)gcd);
    }

    public static void main(String[] args) {
        long solution = solution(3, 3);
        System.out.println(solution);
    }

}
