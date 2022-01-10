package section7_recursive_tree_graph;

public class FiveDFS {

    private static class Node {
        Node l;
        Node r;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.l = new Node(2);
        root.r = new Node(3);

        root.l.l = new Node(4);
        root.l.r = new Node(5);

        root.r.l = new Node(6);
        root.r.r = new Node(7);

        DFS(root);
    }

    private static void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            DFS(root.l);
            DFS(root.r);
            System.out.println(root.data);
        }
    }
}
