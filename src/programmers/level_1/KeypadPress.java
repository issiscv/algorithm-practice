package programmers.level_1;

public class KeypadPress {

    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int lt = 10;
        int rt = 12;

        for (int number : numbers) {

            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                lt = number;
            } else if (number == 3 || number == 6 ||number == 9) {
                answer += "R";
                rt = number;
            } else {
                int ltDistance = getDistance(lt, number);
                int rtDistance = getDistance(rt, number);

                if (ltDistance > rtDistance) {
                    answer += "R";
                    rt = number;
                } else if (ltDistance < rtDistance) {
                    answer += "L";
                    lt = number;
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        lt = number;
                    } else {
                        answer += "R";
                        rt = number;
                    }
                }
            }
        }

        return answer;
    }

    private static int getDistance(int tmp, int number) {
        tmp = (tmp == 0) ? 11 : tmp;
        number = (number == 0) ? 11 : number;

        int x1 = (tmp - 1) / 3;
        int y1 = (tmp - 1) % 3;

        int x2 = (number - 1) / 3;
        int y2 = (number -1 ) % 3;

        return Math.abs(x2-x1) + Math.abs(y2-y1);
    }

    public static void main(String[] args) {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        String solution = solution(numbers, hand);
        System.out.println(solution);
    }

}
