package programmers.level_2;

public class Lv2다음_큰_숫자 {

    public static int solution(int n) {
        int count = Integer.bitCount(n);//1의 개수
        int answer = 0;

        while (true) {
            n++;
            int tmp = Integer.bitCount(n);
            if (tmp == count) {
                answer = n;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(78);
    }

}
