package section8_dfs_bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FourteenPizza {
    static int n, m, answer=Integer.MAX_VALUE;;
    static int[][] arr;
    static List<Point> pz = new ArrayList<>();
    static List<Point> hs = new ArrayList<>();
    static int[] ch, c;

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        arr = new int[n+1][n+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int tmp=scanner.nextInt();
                if(tmp==1) hs.add(new Point(i, j));
                else if(tmp==2) pz.add(new Point(i, j));
            }
        }
        ch = new int[pz.size()];
        c = new int[m];

        comb(0, 0);
        System.out.println(answer);
    }

    private static void comb(int v, int s) {
        if (v == m) {
            int sum = 0;
            for(Point h : hs){
                int dis=Integer.MAX_VALUE;
                for(int i : c){
                    dis=Math.min(dis, Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y));
                }
                sum+=dis;
            }
            answer=Math.min(answer, sum);
        } else {
            for (int i = s; i < pz.size(); i++) {
                c[v] = i;
                comb(v+1, i+1);
            }
        }
    }
}
