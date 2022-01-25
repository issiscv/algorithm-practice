package programmers.greedy;

public class JoyStick {
    public static int solution(String name) {
        int answer = 0;
        int[] diff={0,1,2,3,4,5,6,7,8,9,10,11,12,13,12,11,10,9,8,7,6,5,4,3,2,1};

        for(char c:name.toCharArray())
            answer+=diff[c-'A'];

        int length=name.length();
        int min=length-1;

        for(int i=0;i<length;i++){
            int next=i+1;
            while(next<length && name.charAt(next)=='A'){
                next++;
            }
            min=Math.min(min,i+length-next+Math.min(i,length-next));
        }

        return answer+min;
    }
    //예를 들면 BBBAAAAAAABB 는 I=2일 경우 next = 10, length는 12 이어서 4이됩니다
    //즉, A를 건너지 않고 반대로 넘어가는 경우를 고려하는 것입니다. 여기서 문제는 우리의 시작점은 인덱스 0인것에 있습니다.
    //우리는 i까지 갔다가 되돌아가거나 처음부터 뒤로가서 length-next까지 갔다가 다시 돌아오는 경우를 생각해야합니다.
    //앞의 예에서는 i=2 두칸앞으로 갔다가 돌아오느냐, 처음부터 뒤로가서 length-next = 12 - 10 = 2를 고려해야하는 것입니다.

    public static void main(String[] args) {
        int jeroen = solution("BBBAAAAAAABB");//7
        System.out.println(jeroen);
    }
}
