package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph1991 {

    static List<Node> list = new ArrayList<>();

    private static class Node {
        char c;
        Node lt;
        Node rt;

        public Node(char c) {
            this.c = c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            list.add(new Node((char)('A'+i)));
        }

        for (int i = 0; i < N; i++) {
            char a = scanner.next().charAt(0);
            char b = scanner.next().charAt(0);
            char c = scanner.next().charAt(0);

            Node node = list.get(a - 'A');

            if (b != '.') {
                node.lt = list.get(b - 'A');
            }

            if (c != '.') {
                node.rt = list.get(c - 'A');
            }
        }

        preOrder(list.get(0));
        System.out.println();
        inOrder(list.get(0));
        System.out.println();
        postOrder(list.get(0));
    }

    private static void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.c);
        preOrder(node.lt);
        preOrder(node.rt);
    }

    private static void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.lt);
        System.out.print(node.c);
        inOrder(node.rt);
    }

    private static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.lt);
        postOrder(node.rt);
        System.out.print(node.c);
    }
}
