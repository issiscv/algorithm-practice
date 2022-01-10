package section7_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EightFindCalf {
    static int L = 0;
    static int[] arr = {-1, 1, 5};
    static int[] ch;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ch = new int[10001];

        BFS(n, m);
        System.out.println(L);
    }

    private static void BFS(int s, int e) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);

        while (!queue.isEmpty()) {
            int size = queue.size();//1

            for (int i = 0; i < size; i++) {
                int tmp = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = tmp + arr[j];
                    if (nx == e) {
                        L++;
                        return;
                    } else {
                        if(nx>=1 && nx<=10000 && ch[nx]==0){
                            ch[nx]=1;
                            queue.offer(nx);
                        }
                    }
                }
            }
            L++;
        }
    }
}
