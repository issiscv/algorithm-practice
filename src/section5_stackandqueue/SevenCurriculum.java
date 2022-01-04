package section5_stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SevenCurriculum {

    public static String solution(String str, String curr) {
        Queue<Character> queue = new LinkedList<>();

        for (char n : str.toCharArray()) {
            queue.offer(n);
        }

        for (char p : curr.toCharArray()) {
            if (queue.contains(p)) {
                if (queue.poll() != p) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) {
            return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String curr = scanner.next();

        System.out.println(solution(str, curr));
    }
}
