package section7_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NineShortestPath {

    private static class Node {
        Node lt;
        Node rt;
        int data;

        public Node(int data) {
            this.data = data;
            lt = null;
            rt = null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);

        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        int min = DFS(0, root);
        System.out.println(min);
    }

    private static int DFS(int i, Node root) {
        if (root.lt == null && root.rt == null) {
            return i;
        }
        return Math.min(DFS(i+1, root.lt), DFS(i+1, root.rt));
    }


}
