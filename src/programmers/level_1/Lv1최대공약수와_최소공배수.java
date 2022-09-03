package programmers.level_1;

public class Lv1최대공약수와_최소공배수 {

    public static int[] solution(int n, int m) {

        int gcd = recursive(n, m);

        int lcm = n * m / gcd;

        int[] answer = {gcd, lcm};
        return answer;
    }

    private static int recursive(int n, int m) {
        if (n == 0) {
            return m;
        }
        return recursive(m % n, n);
    }

    public static void main(String[] args) {
        int[] solution = solution(2, 5);
        for (int i : solution) {
            System.out.println(i);
        }
    }

}
