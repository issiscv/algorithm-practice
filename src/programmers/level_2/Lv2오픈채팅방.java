package programmers.level_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lv2오픈채팅방 {

    private static class Log {
        private String uid;
        private String entrance;

        public Log(String uid, String entrance) {
            this.uid = uid;
            this.entrance = entrance;
        }
    }

    public static String[] solution(String[] record) {

        Map<String, String> map = new HashMap<>();
        List<Log> list = new ArrayList<>();

        for (String r : record) {
            String[] split = r.split(" ");
            String entrance = split[0];
            String uid = split[1];

            if (entrance.equals("Enter")) {
                String nickname = split[2];
                map.put(uid, nickname);

                list.add(new Log(uid, "님이 들어왔습니다."));
            } else if (entrance.equals("Change")) {
                String nickname = split[2];
                map.put(uid, nickname);

            } else {
                list.add(new Log(uid, "님이 나갔습니다."));
            }

        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Log log = list.get(i);
            String uid = log.uid;
            String entrance = log.entrance;

            answer[i] = map.get(uid) + "" + entrance;
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        solution(record);
    }

}
