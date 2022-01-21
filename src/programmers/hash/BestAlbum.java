package programmers.hash;

import java.util.*;

public class BestAlbum {

    private static class Music implements Comparable<Music>{
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
            return o.play-this.play;
        }
    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Integer> map = new HashMap<>();
        List<String> genre = new ArrayList<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        while (!map.isEmpty()) {
            int max = Integer.MIN_VALUE;
            String key = "";

            for (String s : map.keySet()) {
                if (map.get(s) > max) {
                    max = map.get(s);
                    key = s;
                }
            }
            genre.add(key);
            map.remove(key);
        }

        List<Music> result = new ArrayList<>();

        for (String g : genre) {
            List<Music> tmp = new ArrayList<>();

            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(g)) {
                    tmp.add(new Music(genres[i], plays[i], i));
                }
            }
            Collections.sort(tmp);
            result.add(tmp.get(0));
            if (tmp.size() > 1)
                result.add(tmp.get(1));
        }
        answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
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
