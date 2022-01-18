package basic_algorithm.section2_Array;

import java.util.Scanner;

public class ThreeRockScissorsPaper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            switch (a[i]) {
                case 1:
                    switch (b[i]) {
                        case 1:
                            System.out.println("D");
                            break;
                        case 2:
                            System.out.println("B");
                            break;
                        case 3:
                            System.out.println("A");
                            break;
                    }
                    break;
                case 2:
                    switch (b[i]) {
                        case 1:
                            System.out.println("A");
                            break;
                        case 2:
                            System.out.println("D");
                            break;
                        case 3:
                            System.out.println("B");
                            break;
                    }
                    break;
                case 3:
                    switch (b[i]) {
                        case 1:
                            System.out.println("B");
                            break;
                        case 2:
                            System.out.println("A");
                            break;
                        case 3:
                            System.out.println("D");
                            break;
                    }
                    break;
            }
        }

    }
}
