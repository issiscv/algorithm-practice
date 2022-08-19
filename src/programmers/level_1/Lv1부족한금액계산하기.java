package programmers.level_1;

public class Lv1부족한금액계산하기 {

    public static long solution(int price, int money, int count) {
        long answer = -1;

        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;// 3 6 9 12
        }

        if (sum <= money) {
            answer = 0;
        } else {
            answer = sum - money;
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {

        solution(3, 20, 4);

    }
}
