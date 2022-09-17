package programmers.level_2;

public class Lv2n진수_게임 {

    public static String solution(int n, int t, int m, int p) {
        String answer = "";

        int count = 0;//튜브가 말한 횟수 카운트
        int idx = 1;//
        int number = 0;

        //0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1
        while (count < t) {
            String s = Integer.toString(number++, n);
            for (char c : s.toCharArray()) {
                int a = idx % m;
                if (a == 0) {
                    a = m;
                }

                if (a == p && count < t) {
                    answer += Character.toUpperCase(c);
                    count++;
                }
                idx++;
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        //진법, 말할 숫자 개수, 참가 인원, 나의 순서
        solution(16, 16, 2, 2);
    }

}
