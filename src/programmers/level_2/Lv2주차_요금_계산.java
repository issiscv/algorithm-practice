package programmers.level_2;

import java.util.*;

public class Lv2주차_요금_계산 {

    private static class CarFee implements Comparable<CarFee>{
        String number;
        int fee;

        public CarFee(String number, int fee) {
            this.number = number;
            this.fee = fee;
        }



        @Override
        public int compareTo(CarFee o) {
            return this.number.compareTo(o.number);
        }
    }

    public static int[] solution(int[] fees, String[] records) {
        int[] answer = {};

        Map<String, String> map = new HashMap<>();
        Map<String, Integer> minMap = new HashMap<>();

        List<CarFee> carFeeList = new ArrayList<>();

        for (int i = 0; i < records.length; i++) {
            String[] split = records[i].split(" ");

            String time = split[0];
            String number = split[1];
            String inOut = split[2];

            //입장 기록이 있다
            if (map.containsKey(number)) {
                String enterTime = map.get(number);

                int min = calculateMinute(enterTime, time);
                minMap.put(number, minMap.getOrDefault(number, 0) + min);

                map.remove(number);

            } else {//처음 드감
                map.put(number, time);
            }
        }

        for (String number : map.keySet()) {
            int min = calculateMinute(map.get(number), "23:59");
            minMap.put(number, minMap.getOrDefault(number, 0) + min);
        }

        for (String number : minMap.keySet()) {
            int fee = calculateFee(minMap.get(number), fees);
            carFeeList.add(new CarFee(number, fee));
        }

        Collections.sort(carFeeList);

        answer = carFeeList.stream().mapToInt(cf -> cf.fee).toArray();


        return answer;
    }

    private static int calculateFee(int min, int[] fees) {
        int basicTime = fees[0];
        int basicFee = fees[1];

        int sum = basicFee;


        if (min > basicTime) {
            int extraMin = min - basicTime;//초과한 시간
            double ceil = Math.ceil(extraMin / (double) fees[2]);

            sum += ceil * fees[3];
        }

        return sum;
    }

    private static int calculateMinute(String enterTime, String outTime) {

        String[] enter = enterTime.split(":");
        String[] out = outTime.split(":");

        int hour = Integer.parseInt(out[0]) - Integer.parseInt(enter[0]);
        int min = Integer.parseInt(out[1]) - Integer.parseInt(enter[1]);

        return hour * 60 + min;
    }

    public static void main(String[] args) {
        int[] fees = {1, 461, 1, 10};
        String[] records = {
                "00:00 1234 IN"        };

        solution(fees, records);
    }

}
