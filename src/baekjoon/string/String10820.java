package baekjoon.string;

import java.util.Scanner;

public class String10820 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine()) {
            int[] arr = new int[4];
            String str = scanner.nextLine();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (Character.isLowerCase(c)) {
                    arr[0]++;
                } else if (Character.isUpperCase(c)) {
                    arr[1]++;
                } else if (Character.isDigit(c)) {
                    arr[2]++;
                } else if (Character.isSpaceChar(c)) {
                    arr[3]++;
                }
            }

            System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        }
    }
}
