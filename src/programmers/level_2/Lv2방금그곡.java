package programmers.level_2;

import java.util.LinkedList;
import java.util.Queue;

public class Lv2방금그곡 {

    public static String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        m = convert(m);
        int max = Integer.MIN_VALUE;

        for (String musicinfo : musicinfos) {
            String[] split = musicinfo.split(",");
            String start = split[0];
            String end = split[1];
            String title = split[2];

            String melody = convert(split[3]);

            int streamingTime = calculateMinGap(start, end);//14
            int melodyTime = melody.length();//7

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < streamingTime; i++) {
                sb.append(melody.charAt(i % melodyTime));
            }

            if (sb.toString().contains(m)) {
                if (streamingTime > max) {
                    max = streamingTime;
                    answer = title;
                }
            }

        }
        System.out.println(answer);

        return answer;
    }

    private static int calculateMinGap(String start, String end) {
        int startH = Integer.parseInt(start.split(":")[0]);
        int startM = Integer.parseInt(start.split(":")[1]);

        int endH = Integer.parseInt(end.split(":")[0]);
        int endM = Integer.parseInt(end.split(":")[1]);

        int hourToMin = (endH - startH) * 60;
        int min = endM - startM;

        return hourToMin == 0 ? Math.abs(min) : hourToMin + min;
    }

    private static String convert(String m) {
        m = m.replaceAll("A#", "a");
        m = m.replaceAll("C#", "c");
        m = m.replaceAll("D#", "d");
        m = m.replaceAll("F#", "f");
        m = m.replaceAll("G#", "g");
        return m;
    }

    public static void main(String[] args) {
        String[] str = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
        solution("CC#BCC#BCC#BCC#B", str);
    }

}
