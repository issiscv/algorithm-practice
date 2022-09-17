package programmers.level_2;

public class Lv2땅따먹기 {

    public static int solution(int[][] land) {
        int answer = 0;


        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }

        answer = Integer.MIN_VALUE;
        for (int i : land[land.length - 1]) {
            answer = Math.max(answer, i);
        }


        return answer;
    }

    public static void main(String[] args) {

        int[][] land = {
                {1, 2, 3, 5},
                {5, 6, 7, 8},
                {4, 3, 2, 1}
        };

        solution(land);
    }

}
