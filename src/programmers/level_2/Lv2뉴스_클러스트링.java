package programmers.level_2;

import java.util.*;

public class Lv2뉴스_클러스트링 {

    public static int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        List<String> union = new ArrayList<>();
        List<String> interSection = new ArrayList<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i = 0 ; i < str1.length() - 1 ; i++){
            char first = str1.charAt(i);
            char second = str1.charAt(i + 1);

            String s = first + "" + second;

            if(first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z'){
                list1.add(s);
            }
        }

        for(int i = 0 ; i < str2.length() - 1 ; i++){
            char first = str2.charAt(i);
            char second = str2.charAt(i + 1);

            String s = first + "" + second;

            if(first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z'){
                list2.add(s);
            }
        }

        for (String s : list1) {
            if (list2.remove(s)) {
                interSection.add(s);
            }
            union.add(s);
        }

        for (String s : list2) {
            union.add(s);
        }

        double jakard = 0;

        if(union.size() == 0) {
            jakard = 1;
        } else {
            jakard = (double)interSection.size() / (double)union.size();
        }

        int i = (int) (jakard * 65536);
        System.out.println(i);
        return i;
    }


    public static void main(String[] args) {
        solution("handshake", "shake hands");
    }

}

