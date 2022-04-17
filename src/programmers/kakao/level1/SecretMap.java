package programmers.kakao.level1;

public class SecretMap {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        char[][] map = new char[n][n];

        for (int i = 0; i < n; i++) {

            String a = toBinary(arr1[i], n);
            String b = toBinary(arr2[i], n);

            for (int j = 0; j < n; j++) {
                if (a.charAt(j) == '1' || b.charAt(j) == '1') {
                    map[i][j] = '1';
                } else {
                    map[i][j] = '0';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            String tmp = "";
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '1')
                    tmp += "#";
                else
                    tmp += " ";
            }
            answer[i] = tmp;
        }

        return answer;
    }

    private static String toBinary(int a, int n) {
        String tmp = "";
        while (a != 0) {
            tmp += a % 2;
            a = a / 2;
        }

        while (tmp.length() < n) {
            tmp += "0";
        }

        return new StringBuilder(tmp).reverse().toString();
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        String[] solution = solution(n, arr1, arr2);
        for (String s : solution) {
            System.out.println(s);
        }
    }
}
