package basic_algorithm.section7_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

public class SevenBFS {

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

        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);

        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        BFS(root);
    }

    private static void BFS(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();//1

            for (int i = 0; i < size; i++) {
                Node tmp = queue.poll();
                System.out.print(tmp.data + " ");
                if (tmp.lt != null) queue.offer(tmp.lt);
                if (tmp.rt != null) queue.offer(tmp.rt);

            }
        }
    }

}
