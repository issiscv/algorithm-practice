package baekjoon.greedy;

import java.util.Scanner;

public class Greedy1543 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String document = scanner.nextLine();
        String keyWord = scanner.nextLine();
        int answer = 0;

        for (int i = 0; i <= document.length()-keyWord.length(); i++) {

            boolean flag = true;

            for (int j = 0; j < keyWord.length(); j++) {

                if (document.charAt(i+j) != keyWord.charAt(j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                i += keyWord.length() - 1;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
