package section4_hashandset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FourAllAnagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String target = scanner.next();

        Map<Character, Integer> store = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < target.length(); i++) {
            store.put(str.charAt(i), store.getOrDefault(str.charAt(i), 0) + 1);
            map.put(target.charAt(i), map.getOrDefault(target.charAt(i), 0) + 1);
        }
        int answer = 0;

        if (store.equals(map)) answer++;

        int lt = 0;
        for (int i = target.length(); i < str.length(); i++) {
            store.put(str.charAt(lt), store.getOrDefault(str.charAt(lt), 0) - 1);
            if (store.get(str.charAt(lt)) == 0) store.remove(str.charAt(lt));
            store.put(str.charAt(i), store.getOrDefault(str.charAt(i), 0) + 1);

            if (store.equals(map)) answer++;
            lt++;
        }

        System.out.println(answer);
    }
}
