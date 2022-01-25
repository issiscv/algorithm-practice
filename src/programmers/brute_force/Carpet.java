package programmers.brute_force;

public class Carpet {

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int tmp = brown + yellow;

        for (int i = 3; i <= tmp; i++) {
            int j = tmp / i;

            if (tmp % i == 0 && j >= 3) {
                int row = Math.max(i, j);
                int col = Math.min(i, j);
                int t = (row-2) * (col-2);
                if (t == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int b = 10;
        int y = 2;

        int[] solution = solution(b, y);
        for (int i : solution) {
            System.out.println(i);
        }

    }
}
