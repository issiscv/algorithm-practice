package programmers.level_2;

public class Lv2이진_변환_반복하기 {

    public static int[] solution(String s) {
        int[] answer = {};

        int count = 0;
        int zero = 0;
        int one = 0;

        while (!s.equals("1")) {

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zero++;
                } else {
                    one++;
                }
            }

            s = toBinary(one);

            count++;
            one = 0;
        }

        answer = new int[2];
        answer[0] = count;
        answer[1] = zero;
        return answer;
    }

    private static String toBinary(int num) {

        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            sb.append(num % 2);
            num = num / 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "110010101001";
        solution(str);
    }

}
