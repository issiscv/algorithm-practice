package programmers.level_1;

import java.util.ArrayList;
import java.util.List;

public class AddMissingNumber {

    public static int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }
        for (int tmp : numbers) {
            numberList.add(tmp);
        }

        for (int number : list) {
            if (!numberList.contains(number))
                answer += number;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};

        solution(numbers);
    }

}
