package programmers.kakao.level1;

public class KeyPad {

    public static String solution(int[] numbers, String hand) {
        String answer = "";
        
        int lt = 10;//왼손 번호
        int rt = 12;//오른손 번호

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                lt = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer += "R";
                rt = number;
            } else {

                int ld = getDistance(lt, number);
                int rd = getDistance(rt, number);

                if (ld > rd) {
                    answer += "R";
                    rt = number;
                } else if (ld < rd) {
                    answer += "L";
                    lt = number;
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        lt = number;
                    }
                    else {
                        answer += "R";
                        rt = number;
                    }
                }
            }
        }

        return answer;
    }


    public static int getDistance(int index, int number) {

        // 숫자 0의 경우 11로 치환
        index = (index == 0) ? 11 : index;
        number = (number == 0) ? 11 : number;

        int x = (index - 1) / 3;
        int y = (index - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;

        return Math.abs(x-numberX) + Math.abs(y-numberY);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        solution(numbers, "right");
    }
}
