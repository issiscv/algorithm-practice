package programmers.hash;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap<>();
        Arrays.sort(phone_book);

        for (String s : phone_book) {
            map.put(s, 0);
        }

        for (String s : phone_book) {
            for (int i = 0; i < s.length(); i++) {
                String tmp = s.substring(0, i);
                if (map.containsKey(tmp)) return false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] pb = {"119", "97674223", "1195524421"};

//        System.out.println(solution(pb));
    }
}
