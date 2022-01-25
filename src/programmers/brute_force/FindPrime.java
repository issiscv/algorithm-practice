package programmers.brute_force;

import java.util.ArrayList;
import java.util.List;

public class FindPrime {

    static boolean[] ch;
    static String str;
    static List<Integer> list = new ArrayList<>();

    public static int solution(String numbers) {
        int answer = 0;

        str = numbers;
        ch = new boolean[str.length()];

        for (int i = 1; i <= numbers.length(); i++) {
            DFS(0, "", i);
        }
        for (Integer i : list) {
            if (isPrime(i)) {
                answer++;
            }
        }

        return answer;
    }

    private static boolean isPrime(int i) {

        boolean flag = true;
        if (i == 0 || i == 1) return false;

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void DFS(int v, String s, int dept) {
        if (v == dept) {
            if (!list.contains(Integer.parseInt(s))) {
                list.add(Integer.parseInt(s));
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (!ch[i]) {
                    ch[i] = true;
                    String tmp = s + str.charAt(i);
                    DFS(v+1, tmp, dept);
                    ch[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("17"));
    }

}
