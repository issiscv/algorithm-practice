package programmers.hash;

import java.util.*;

public class BestAlbum {

    static class Music implements Comparable<Music> {
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }

        @Override
        public int compareTo(Music o) {
            return o.play - this.play;
        }
    }

    public static int[] solution(String[] genres, int[] plays) {

        List<String> gen = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        while (!map.isEmpty()) {
            int max = -1;
            String key = "";
            for (String s : map.keySet()) {
                if (map.get(s) > max) {
                    max = map.get(s);
                    key = s;
                }
            }
            map.remove(key);
            gen.add(key);
        }
        List<Music> result = new ArrayList<>();

        for (String g : gen) {
            List<Music> list = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(g)) {
                    list.add(new Music(g, plays[i], i));
                }
            }
            Collections.sort(list);
            result.add(list.get(0));

            if (list.size() != 1) {
                result.add(list.get(1));
            }
        }

        for (Music music : result) {
            System.out.println(music.idx);
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i).idx;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        solution(genres, plays);
    }

}
