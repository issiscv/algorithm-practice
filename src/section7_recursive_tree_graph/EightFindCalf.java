package section7_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EightFindCalf {
    static int[] arr = {-1, 1, 5};
    static int n, m;
    static int[] ch = new int[100001];
    static int L = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        int sol = BFS(n, m);
        System.out.println(sol);
    }

    private static int BFS(int s, int e) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int tmp = queue.poll();

                if (tmp == e) {
                    return L++;
                } else {
                    for (int j = 0; j < 3; j++) {
                        int dx = tmp + arr[j];
                        if (ch[dx] == 0 && dx > 0 && dx < 10001) {
                            queue.offer(dx);
                            ch[dx] = 1;
                        }
                    }
                }
            }

            L++;
        }
        return 0;
    }
}
