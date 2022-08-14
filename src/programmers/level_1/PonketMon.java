package programmers.level_1;

import java.util.HashSet;
import java.util.Set;

public class PonketMon {

    public static int solution(int[] nums) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        answer = set.size() >= nums.length / 2 ? nums.length / 2 : set.size();

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};

        solution(nums);
    }
}
