package baekjoon.greedy;

import java.util.*;

public class Greedy1700 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            list.add(scanner.nextInt());
        }

        Set<Integer> set = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < K; i++) {
            int tmp = list.get(i);

            if (set.contains(tmp)) continue;
            if (set.size() < N) {
                set.add(tmp);
                continue;
            }
            int idx = -1;
            int max = -1;
            int t = -1;
            for (int s : set) {
                List<Integer> subList = list.subList(i+1, K);//2 7

                //남아있는 것 중에 set 에 있는게 있을 경우
                if (subList.contains(s)) {
                    t = subList.indexOf(s);//2의 위치
                } else {
                    t = K;// K
                }
                
                if (t > idx) {
                    idx = t;
                    max = s;
                }
            }
            set.remove(max);
            set.add(tmp);
            answer++;
        }
        System.out.println(answer);
    }
}
