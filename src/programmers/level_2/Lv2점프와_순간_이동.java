package programmers.level_2;


public class Lv2점프와_순간_이동 {

    public static int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        int solution = solution(5000);
        System.out.println(solution);
    }

}
