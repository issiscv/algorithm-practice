package programmers.level_2;

public class Lv2다음_큰_숫자 {

    public static int solution(int n) {

        int count = Integer.bitCount(n);

        while (true) {
            n++;
            int a = Integer.bitCount(n);
            if (a == count) return n;
        }

    }

    public static void main(String[] args) {
        solution(78);
    }

}
