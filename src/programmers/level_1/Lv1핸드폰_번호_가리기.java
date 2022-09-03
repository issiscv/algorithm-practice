package programmers.level_1;

public class Lv1핸드폰_번호_가리기 {

    public static String solution(String phone_number) {

        String first = phone_number.substring(0, phone_number.length() - 4);
        first = first.replaceAll("[0-9]", "*");
        String second = phone_number.substring(phone_number.length() - 4, phone_number.length());

        return first + second;
    }

    public static void main(String[] args) {
        solution("027778888");
    }

}
