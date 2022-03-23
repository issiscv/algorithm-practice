package baekjoon.string;

import java.util.Scanner;

public class String10820 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            int[] arr = new int[4];
            String s = scanner.nextLine();

            for (int i = 0; i < s.length(); i++) {
                if (Character.isLowerCase(s.charAt(i)))
                    arr[0]++;
                else if (Character.isUpperCase(s.charAt(i)))
                    arr[1]++;
                else if (Character.isDigit(s.charAt(i)))
                    arr[2]++;
                else
                    arr[3]++;
            }

            System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        }
    }
}
