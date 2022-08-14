package programmers.level_1;

public class MakePrime {

    public static int solution(int[] nums) {
        int answer = 0;

        boolean[] flag = new boolean[5001];
        flag[0] = true;
        flag[1] = true;

        for (int i = 2; i < flag.length; i++) {
            for (int j = i * 2; j < flag.length; j += i) {
                flag[j] = true;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int tmp = nums[i] + nums[j] + nums[k];
                    if (!flag[tmp]) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        solution(nums);
    }
}
