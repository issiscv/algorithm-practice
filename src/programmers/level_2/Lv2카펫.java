package programmers.level_2;

public class Lv2카펫 {

    public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        answer = new int[2];
        //i 는 행 j 는 열
        for (int i = 1; i <= yellow; i++) {
            for (int j = 1; j <= yellow; j++) {
                if (i >= j) {
                    if (i * j == yellow) {
                        int tmp = j * 2 + i * 2 + 4;
                        if (tmp == brown) {
                            int row = i + 2;
                            int col = j + 2;
                            answer[0] = row;
                            answer[1] = col;
                            return answer;
                        }
                    }
                } else {
                    break;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(10, 2);
        for (int i : solution) {
            System.out.println(i);
        }
    }

}
