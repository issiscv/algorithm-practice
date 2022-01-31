package baekjoon.greedy;

import java.util.Scanner;

public class Greedy1543 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String document = scanner.nextLine();
        String find = scanner.nextLine();


        //abaacbaba
        //aba
        int count = 0;	// 단어가 중복되지않고 등장하는 횟수
        for (int i = 0; i <= document.length() - find.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < find.length(); j++) {
                if (document.charAt(i+j) != find.charAt(j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
                i += find.length()-1;
            }

        }
        System.out.println(count);

    }
}
