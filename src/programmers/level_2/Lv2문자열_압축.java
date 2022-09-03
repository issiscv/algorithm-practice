package programmers.level_2;

public class Lv2문자열_압축 {

    public static int solution(String s) {
        int answer = Integer.MAX_VALUE;

        if (s.length() == 1) return 1;

        for (int i = 1; i <= s.length() / 2; i++) {
            String prev = s.substring(0, i);
            String cur = "";
            int cnt = 1;
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < s.length(); j += i) {
                if (i + j >= s.length()) {
                    cur = s.substring(j, s.length());
                } else {
                    cur = s.substring(j, j + i);
                }

                if (prev.equals(cur)) {
                    cnt++;
                } else if (cnt == 1) {
                    sb.append(prev);
                    prev = cur;
                } else {
                    sb.append(cnt).append(prev);
                    cnt = 1;
                    prev = cur;
                }
            }

            if (cur.length() <= i) {
                if (cnt > 1) {
                    sb.append(cnt);
                }
                sb.append(cur);
            }

            answer = Math.min(answer, sb.length());

        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "aabbaccc";
        int solution = solution(s);
        System.out.println(solution);
    }

}
