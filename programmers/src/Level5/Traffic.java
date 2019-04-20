package Level5;

import java.util.*;

// 문제 설명
// : 카카오 로그를 분석해서 초당 최대 처리량을 구해라
// : 로그 응답여부는 관련이 없다.
// : 들어오는 값(lines)은 ["년/월/일 시/분/초ms 처리시간"]
// : 시/분/초ms 값은 응답이 완료된 시간이다.
// : 0.001 <= 처리시간 <= 3.000

// 입출력 예
// 1 input : lines = ["2016-09-15 20:59:57.421 0.351s",
//                "2016-09-15 20:59:58.233 1.181s",
//                "2016-09-15 20:59:58.299 0.8s",
//                "2016-09-15 20:59:58.688 1.041s",
//                "2016-09-15 20:59:59.591 1.412s",
//                "2016-09-15 21:00:00.464 1.466s",
//                "2016-09-15 21:00:00.741 1.581s",
//                "2016-09-15 21:00:00.748 2.31s",
//                "2016-09-15 21:00:00.966 0.381s",
//                "2016-09-15 21:00:02.066 2.62s"]
// 1 output : 7
public class Traffic {
    public int solution(String[] lines) {
        int answer = 0;
        int sumS = 0;
        int sumE = 0;
        int start, end;
        List<Log> buffer = new ArrayList<>();

        for(int i = 0 ; i < lines.length ; i++) {
            String[] tokens = lines[i].split(" ");
            buffer.add(i, new Log(tokens[1], tokens[2]));
        }

        for(int i = 0 ; i < buffer.size() ; i ++) {
            sumS = 0;
            sumE = 0;
            start = buffer.get(i).start;
            end = buffer.get(i).end;
            for(int j = 0 ; j < buffer.size() ; j++) {
                int a1 = buffer.get(j).start;
                int a2 = buffer.get(j).end;

                if(a1 <= start + 999 && start + 999 <= a2) {
                    sumS++;
                }else if(start <= a1 && a2 <= start + 999) {
                    sumS++;
                }else if(a1 <= start && start <= a2) {
                    sumS++;
                }else if(a1 <= start && start <= a2 && a1 <= start + 999 && start + 999 <= a2) {
                    sumS++;
                }

                if(a1 <= end + 999 && end + 999 <= a2) {
                    sumE++;
                }else if(end <= a1 && a2 <= end + 999) {
                    sumE++;
                }else if(a1 <= end && end <= a2) {
                    sumE++;
                }else if(a1 <= end && end <= a2 && a1 <= end + 999 && end + 999 <= a2) {
                    sumE++;
                }
            }

            sumS = (sumS>sumE ? sumS:sumE);
            answer = (answer>sumS ? answer : sumS);
        }
        System.out.println(answer);
        return answer;
    }

    // 시간규칙 : (시+분+초).밀리초
    class Log {
        int start;
        int end;

        public Log(String start, String end) {
            this.end = getSeconds(start);
            this.start = getStartTime(end);
        }

        private Integer getSeconds(String text) {
            String[] times = text.split(":");
            return (int)(((Integer.parseInt(times[0]) * 3600) + (Integer.parseInt(times[1]) * 60) + Double.parseDouble(times[2]))*1000);
        }

        private Integer getStartTime(String text) {
            return this.end - (int)(Double.parseDouble(text.split("s")[0]) * 1000) + 1;
        }
    }
}
// 처음 시도한 for문.
//            for(int j = 0 ; j <buffer.size() ; j ++) {
//                if(start <= buffer.get(j).start || buffer.get(j).start <= start + 999) {
//                    sumS ++;
//                }else if(start <= buffer.get(j).end || buffer.get(j).end <= start + 999) {
//                    sumS ++;
//                }
//                if(end <= buffer.get(j).start || buffer.get(j).start <= end + 999) {
//                    sumE ++;
//                }else if(end <= buffer.get(j).end || buffer.get(j).end <= end + 999) {
//                    sumE ++;
//                }
//            }
