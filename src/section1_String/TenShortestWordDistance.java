package section1_String;

import java.util.Scanner;

public class TenShortestWordDistance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        char[] ca = str.toCharArray();
        int[] answer = new int[ca.length];

        int dis = 100;

        for (int i = 0; i < ca.length; i++) {
            if (ca[i] == c) {
                answer[i] = 0;
                dis = 0;
            } else {
                dis++;
                answer[i] = dis;
            }
        }

        for (int i = ca.length-1; i >= 0; i--) {
            if (ca[i] == c) {
                answer[i] = 0;
                dis = 0;
            } else {
                dis++;
                answer[i] = Math.min(answer[i], dis);
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
