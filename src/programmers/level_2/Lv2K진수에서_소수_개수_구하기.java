package programmers.level_2;

public class Lv2K진수에서_소수_개수_구하기 {


    public static int solution(int n, int k) {
        int answer = 0;

        String s = Integer.toString(n, k);
        int i, j;

        for(i = 0; i < s.length(); i = j) {
            for(j = i+1; j < s.length() && s.charAt(j) != '0'; j++);
            String substring = s.substring(i, j);
            if (isPrime(Long.parseLong(substring))) {
                answer++;
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static boolean isPrime(long n){
        if(n <= 1) return false;
        else if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        solution(437674, 3);
    }

}
