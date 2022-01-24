package programmers.sort;

import java.util.Arrays;
import java.util.Comparator;

public class BigNumber {

    public static String solution(int[] numbers) {
        String answer = "";
        String[] result = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        //기본 정렬 조건은 오름차순, 양수일 경우 o1 > o2 이면 o1이 o2 뒤로
        Arrays.sort(result, new Comparator<String>() {
            @Override       //      3            30
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1+o2);//o2+o1 이 더 커서 양수일 경우
            }
        });

        if (result[0].equals("0")) {
            return "0";
        }

        for (String s : result) {
            answer += s;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        System.out.println(solution(numbers));
    }
}
