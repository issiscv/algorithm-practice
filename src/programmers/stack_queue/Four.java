package programmers.stack_queue;

import java.util.ArrayList;
import java.util.List;

public class Four {

    public static List<Integer> solution(int[] prices) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            int tmp = prices[i];
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > tmp) {
                    count++;
                } else {
                    break;
                }
            }
            list.add(count);
        }
        for (Integer a : list) {
            System.out.println(a);
        }

        return list;
    }

    public static void main(String[] args) {

        int[] prices = {1, 2, 3, 2, 3};

        solution(prices);
    }
}
