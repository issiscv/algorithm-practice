package programmers.level_1;

public class NewIdRecommendation {

    public static String solution(String new_id) {

        String str = new_id.toLowerCase();

        str = str.replaceAll("[^0-9a-z-_.]", "");
        str = str.replaceAll("[.]{2,}", ".");
        str = str.replaceAll("^[.]", "");
        str = str.replaceAll("[.]$", "");

        if (str.equals("")) {
            str += "a";
        }

        if (str.length() >= 16) {
            str = str.substring(0, 15);
            str = str.replaceAll("[.]$", "");
        }

        while (str.length() <= 2) {
            str += str.charAt(str.length()-1);
        }

        System.out.println(str);

        return str;
    }

    public static void main(String[] args) {
        solution("...!@BaT#*..y.abcdefghijklm");
    }
}
