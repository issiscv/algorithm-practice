package programmers.level_2;

import java.util.ArrayList;
import java.util.List;

public class Lv2N_제곱_배열_자르기 {

    public static List<Long> solution(int n, long left, long right) {

        List<Long> list = new ArrayList<>();

        for (long i = left; i <= right; i++) {
            list.add(Math.max(i/n, i%n)+1);
        }

        return list;
    }

    public static void main(String[] args) {
        solution(3, 2, 5);
    }

}
