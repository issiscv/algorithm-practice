package programmers.greedy;

import java.util.Stack;

public class CreateBigNumber {


    public static String solution(String number, int k) {
        String answer = "";
        Stack<Integer> stack = new Stack<>();
        int idx = k;
        for (int i = 0; i < number.length(); i++) {
            int a = number.charAt(i) - '0';

            while (!stack.isEmpty() && a > stack.peek() && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(a);
        }

        for (int i = 0; i < number.length() - idx; i++) {
            answer += stack.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        String str = "4177252841";
        int k = 4;
        System.out.println(solution(str, k));
    }
}
