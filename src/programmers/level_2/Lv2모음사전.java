package programmers.level_2;

public class Lv2모음사전 {

    private static char[] c = {'A', 'E', 'I', 'O', 'U'};
    private static int cnt = 0;
    private static int ans = 0;

    public static int solution(String word) {
        DFS(0, "", word);
        return ans-1;
    }

    private static void DFS(int v, String s, String target) {
        if (v > 5) return;
        cnt++;
        if (s.equals(target)) {
            ans = cnt;
            return;
        } else {
            for (int i = 0; i < 5; i++) {
                DFS(v + 1, s + c[i], target);
            }
        }

    }

    public static void main(String[] args) {
        solution("AAAE");
    }

}
