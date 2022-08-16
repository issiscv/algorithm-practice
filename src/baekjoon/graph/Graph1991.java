package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph1991 {

    private static List<Node> list;

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

        list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new Node((char)('A' + i)));
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

    private static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data);
        preOrder(root.lt);
        preOrder(root.rt);
    }

    private static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.lt);
        System.out.print(root.data);
        inOrder(root.rt);
    }

    private static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.lt);
        postOrder(root.rt);
        System.out.print(root.data);
    }
}
