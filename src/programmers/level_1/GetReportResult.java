package programmers.level_1;

import java.util.*;

public class GetReportResult {

    public static int[] solution(String[] idList, String[] report, int k) {
        int[] answer = new int[idList.length];

        Map<String, List<String>> reportedMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < idList.length; i++) {
            reportedMap.put(idList[i], new ArrayList<>());
        }

        for (int i = 0; i < report.length; i++) {
            StringTokenizer st = new StringTokenizer(report[i]);
            String userId = st.nextToken();
            String reportedId = st.nextToken();

            List<String> list = reportedMap.get(userId);
            if (!list.contains(reportedId)) {
                list.add(reportedId);
                countMap.put(reportedId, countMap.getOrDefault(reportedId, 0) + 1);
            }

            reportedMap.put(userId, list);
        }

        List<String> bannedUser = new ArrayList<>();
        for (String user : countMap.keySet()) {
            Integer count = countMap.get(user);
            if (count >= k) {
                bannedUser.add(user);
            }
        }

        Map<String, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < idList.length; i++) {
            integerMap.put(idList[i], i);
        }

        for (String user : reportedMap.keySet()) {

            List<String> list = reportedMap.get(user);
            for (String s : list) {
                if (bannedUser.contains(s)) {
                    Integer idx = integerMap.get(user);
                    answer[idx]++;
                }
            }
        }

        for (int i : answer) {
            System.out.println(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] idList = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        solution(idList, report, k);
    }
}
