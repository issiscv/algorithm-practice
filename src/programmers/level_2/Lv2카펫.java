package programmers.level_2;

public class Lv2카펫 {

    public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        answer = new int[2];

        for (int i = 1; i <= yellow; i++) {
            for (int j = 1; j <= yellow; j++) {
                if (i >= j ) {
                    if (i * j == yellow) {
                        int size = i * 2 + j * 2 + 4;
                        if (size == brown) {
                            int a = i + 2;
                            int b = j + 2;
                            answer[0] = a;
                            answer[1] = b;
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
