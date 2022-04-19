package programmers.kakao.level2;

public class ZipString {

    public static int solution(String s) {
        int answer = Integer.MAX_VALUE;

        if (s.length() == 1)
            return 1;

        for (int i = 1; i <= s.length() / 2; i++) {
            String copy = s;
            for (int j = 0; j < i; j++) {
                copy += " ";
            }

            String str="";

            int cnt=1;
            for(int j=0; j<copy.length()-i; j+=i){

                String a = copy.substring(j, j+i);
                String b = "";

                if (j + i + i < copy.length()) {
                    b = copy.substring(j+i, j+i+i);
                } else
                    b= copy.substring(j+i, copy.length());

                a = a.trim();
                b = b.trim();

                if(a.equals(b)) cnt++;
                else{
                    if(cnt>1) str+=String.valueOf(cnt);
                    str+=copy.substring(j, j+i);
                    str = str.trim();
                    cnt=1;
                }
            }
            answer = Math.min(answer, str.length());
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String str = "aa";
        solution(str);
    }
}
