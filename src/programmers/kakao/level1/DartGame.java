package programmers.kakao.level1;

import java.util.Arrays;

public class DartGame {

    public static int solution(String dartResult) {
        int answer = 0;
        int idx = 0;
        int arr[] = new int[3]; // 3번의 점수를 저장할 배열

        String tmp = "";
        for(int i = 0;i<dartResult.length();i++){
            switch(dartResult.charAt(i)){
                case '*':
                    arr[idx-1] = arr[idx-1] * 2;
                    if (idx > 1)
                        arr[idx-2] = arr[idx-2] * 2;
                    break;
                case '#':
                    arr[idx-1] = arr[idx-1] * -1;
                    break;
                case 'S':
                    arr[idx] = (int) Math.pow(Integer.parseInt(tmp), 1);
                    idx++;
                    tmp = "";
                    break;
                case 'D':
                    arr[idx] = (int) Math.pow(Integer.parseInt(tmp), 2);
                    idx++;
                    tmp = "";
                    break;
                case 'T':
                    arr[idx] = (int) Math.pow(Integer.parseInt(tmp), 3);
                    idx++;
                    tmp = "";
                    break;
                default:
                    tmp+=String.valueOf(dartResult.charAt(i));
                    break;
            }
        }

        return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        int solution = solution("1D2S#10S");
        System.out.println(solution);
    }
}
