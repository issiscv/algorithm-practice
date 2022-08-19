package programmers.level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lv1최소직사각형 {

    public static int solution(int[][] sizes) {

        int answer = 0;

        int maxV= 0;
        int maxH= 0;

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < 2; j++) {
                int a = sizes[i][0];
                int b = sizes[i][1];

                int v = Math.max(a, b);//가로
                int h = Math.min(a, b);//세로

                maxV = Math.max(maxV, v);
                maxH = Math.max(maxH, h);
            }
        }
        answer = maxV * maxH;
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        solution(sizes);
    }
}
