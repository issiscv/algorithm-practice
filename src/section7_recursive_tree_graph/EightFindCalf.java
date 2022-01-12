package section7_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EightFindCalf {

    static int[] dis = {-1, 1, 5};
    static int[] ch = new int[10001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(bfs(n, m));
    }

    private static int bfs(int s, int e) {
        Queue<Integer> queue = new LinkedList<>();
        ch[s] = 1;
        queue.offer(s);

        int answer = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int x = queue.poll();//5

                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == e) {
                        return answer + 1;
                    }
                    if (nx > 0 && nx < 10001 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            answer++;
        }
        return -1;
    }
}
