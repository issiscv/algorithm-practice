package programmers.level_1;

public class Lv1비밀지도 {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] map1 = drawMap(n, arr1);
        String[] map2 = drawMap(n, arr2);

        for (int i = 0; i < n; i++) {
            String a = map1[i];
            String b = map2[i];
            String str = "";
            for (int j = 0; j < n; j++) {
                if (a.charAt(j) == '1' || b.charAt(j) == '1') {
                    str += "#";
                } else {
                    str += " ";
                }
            }

            answer[i] = str;
        }

        return answer;
    }

    private static String[] drawMap(int n, int[] arr1) {
        String[] map1 = new String[n];

        for (int i = 0; i < n; i++) {
            int tmp = arr1[i];
            String str = "";
            while (tmp > 0) {
                str += tmp % 2;
                tmp = tmp / 2;
            }

            while (str.length() < n) {
                str += "0";
            }

            String s = new StringBuilder(str).reverse().toString();
            map1[i] = s;
        }

        return map1;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        solution(n, arr1, arr2);

    }
}
