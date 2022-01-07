package section6_sortingandsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SixMischief {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        solution(arr);
    }

    private static void solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] clone = arr.clone();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != clone[i]) list.add(i+1);
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
