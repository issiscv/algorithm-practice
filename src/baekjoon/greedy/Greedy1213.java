package baekjoon.greedy;

import java.util.Scanner;

public class Greedy1213 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[26];
        String str = scanner.next();
        int size = str.length();

        for (int i = 0; i < size; i++) {
            arr[str.charAt(i)-'A']++;
        }

        int idx = -1;//몇 번째 인덱스가 홀수인지
        int cnt = 0;//홀수가 몇개인지

        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 != 0) {
                idx = i;
                cnt++;
            }
        }

        //홀수가 하나 이상이거나
        if (cnt > 1 || (cnt == 1 && size % 2 == 0)) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuffer result = new StringBuffer();
        for(int i=0;i<26;i++)
            for(int j=0;j<arr[i]/2;j++)
                result.append((char)(i+'A'));
        StringBuffer tmp = new StringBuffer(result.toString());
        if(cnt==1) result.append((char)(idx+'A'));
        System.out.println(result.toString()+tmp.reverse());
    }
}
