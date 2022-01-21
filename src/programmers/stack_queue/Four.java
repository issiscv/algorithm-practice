package programmers.stack_queue;

import java.util.Stack;

public class Four {

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }

            stack.add(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.pop() - 1;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] prices = {1, 2, 3, 2, 3};

        solution(prices);
    }
}
