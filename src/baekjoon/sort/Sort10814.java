package baekjoon.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort10814 {

    private static class People implements Comparable<People> {

        int age;
        String name;

        public People(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(People o) {
            return this.age - o.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<People> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int age = scanner.nextInt();
            String name = scanner.next();
            list.add(new People(age, name));
        }

        Collections.sort(list);

        for (People people : list) {
            System.out.println(people.age + " " + people.name);
        }
    }

}
