package section6_sortingandsearching;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FiveCheckDuplicated {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }

        if (set.size() == n) System.out.println("U");
        else System.out.println("D");
    }
}
