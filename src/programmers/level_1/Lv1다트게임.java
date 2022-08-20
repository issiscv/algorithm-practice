package programmers.level_1;

public class Lv1다트게임 {

    public static int solution(String dartResult) {

        int[] arr = new int[3];

        int idx = 0;
        String tmp = "";
        for (int i = 0; i < dartResult.length(); i++) {

            switch (dartResult.charAt(i)) {
                case 'S':
                    arr[idx] = (int)Math.pow(Integer.parseInt(tmp), 1);
                    idx++;
                    tmp = "";
                    break;
                case 'D':
                    arr[idx] = (int)Math.pow(Integer.parseInt(tmp), 2);
                    idx++;
                    tmp = "";
                    break;
                case 'T':
                    arr[idx] = (int)Math.pow(Integer.parseInt(tmp), 3);
                    idx++;
                    tmp = "";
                    break;
                case '*':
                    if (idx-1 > 0) {
                        arr[idx-1] = arr[idx-1] * 2;
                        arr[idx-2] = arr[idx-2] * 2;
                    } else {
                        arr[idx-1] = arr[idx-1] * 2;
                    }
                    break;
                case '#':
                    arr[idx-1] = -1 * arr[idx-1];
                    break;
                default:
                    tmp += String.valueOf(dartResult.charAt(i));
                    break;
            }
        }


        int sum = 0;
        for (int i : arr) {
            sum += i;
        }


        return sum;
    }

    public static void main(String[] args) {
        int solution = solution("1D2S#10S");
        System.out.println(solution);
    }

}
