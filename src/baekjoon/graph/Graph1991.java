package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph1991 {

    private static class Node {
        char data;
        Node lt;
        Node rt;

        public Node(char data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Node> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(new Node((char) ('A' + i)));
        }

        Node root = null;

        for (int i = 0; i < N; i++) {
            char a = scanner.next().charAt(0);
            char b = scanner.next().charAt(0);
            char c = scanner.next().charAt(0);

            Node node = list.get(a - 'A');

            if (i == 0) root = node;

            if (b != '.') {
                node.lt = list.get(b - 'A');
            }
            if (c != '.') {
                node.rt = list.get(c - 'A');
            }
        }

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);

    }

    private static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.lt);
        postOrder(root.rt);
        System.out.print(root.data);
    }

    private static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.lt);
        System.out.print(root.data);
        inOrder(root.rt);
    }

    private static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data);
        preOrder(root.lt);
        preOrder(root.rt);
    }
}
