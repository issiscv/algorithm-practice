package programmers.dynamic_programming;

import java.util.*;

public class HighestTower {

    static class Brick implements Comparable<Brick> {
        int width;
        int height;
        int weight;

        public Brick(int width, int height, int weight) {
            this.width = width;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Brick o) {
            return o.width - this.width;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] dp = new int[N];
        Brick[] arr= new Brick[N];
        for(int i=0; i<N; i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            arr[i] = new Brick(a, b, c);
        }

        Arrays.sort(arr);
        dp[0] = arr[0].height;
        int answer = Integer.MIN_VALUE;
        for(int i=1; i< N; i++){
            for(int j=0; j <= i; j++){
                if(arr[j].weight > arr[i].weight){
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }
            dp[i]= dp[i] + arr[i].height;
            answer=Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
