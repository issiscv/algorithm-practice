package programmers.level_2;

import java.util.ArrayList;
import java.util.List;

public class Lv2수식_최대화 {

    private static boolean[] visited = new boolean[3];
    private static char[] operator = {'*', '+', '-'};
    static long answer = 0;
    private static List<Long> numList = new ArrayList<>();
    private static List<Character> operatorList = new ArrayList<>();

    public static long solution(String expression) {

        String num = "";
        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                num += expression.charAt(i);
            } else {
                numList.add(Long.parseLong(num));
                num = "";
                operatorList.add(expression.charAt(i));
            }
        }
        numList.add(Long.parseLong(num));

        DFS(0, new char[3]);

        System.out.println(answer);

        return answer;
    }

    public static long calc(Long num1,Long num2, char op){
        long num = 0;
        switch (op){
            case '+' : return num1 + num2;
            case '-' : return num1 - num2;
            case '*' : return num1 * num2;
        }
        return num;
    }

    private static void DFS(int v, char[] ch) {
        if (v == 3) {
            List<Long> copyNumList = new ArrayList<>(numList);
            List<Character> copyOperatorList = new ArrayList<>(operatorList);

            for (int i = 0; i < ch.length; i++) {
                for (int j = 0; j < copyOperatorList.size(); j++) {
                    if (ch[i] == copyOperatorList.get(j)) {
                        long calc = calc(copyNumList.remove(j), copyNumList.remove(j), ch[i]);
                        copyNumList.add(j, calc);
                        copyOperatorList.remove(j);
                        j--;

                    }
                }
            }
            answer = Math.max(answer,Math.abs(copyNumList.get(0)));
        } else {
            for (int i = 0; i < 3; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    ch[v] = operator[i];
                    DFS(v+1, ch);
                    visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        solution("50*6-3*2");
    }
}

