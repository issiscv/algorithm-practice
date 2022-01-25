package programmers.greedy;

import java.util.Stack;

public class CreateBigNumber {


    public static String solution(String number, int k) {
        int a = k;
        String answer = "";
        Stack<Integer> stack = new Stack<>();

        //10
        for (int i = 0; i < number.length(); i++) {
            int tmp = number.charAt(i) - '0';
            while (!stack.isEmpty() && stack.peek() < tmp && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(tmp);
        }

        for (int i = 0; i < number.length()-a; i++) {
            answer += String.valueOf(stack.get(i));
        }

        return answer;
    }


    public static void main(String[] args) {
        String str = "4177252841";
        int k = 4;
        System.out.println(solution(str, k));
    }
}
