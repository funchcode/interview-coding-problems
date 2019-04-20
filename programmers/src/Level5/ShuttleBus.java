package Level5;

import java.lang.reflect.Array;
import java.util.*;

public class ShuttleBus {
    // n운행횟수,   t운행간격,  m수용인원,  timetable대기열
    public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        int[] peoples = getTime(timetable);
        int[] buses = getBus(n, t);
        int idx = 0;
        int end = 0;
        boolean target = false;
        for(int i = 0 ; i < buses.length ; i++) {
            if(peoples[idx] > buses[i]) {
                continue;
            }
            for(int j = 0 ; j < m ; j++) {
                if(peoples.length == idx) {
                    target = true;
                    end = buses[i];
                    break;
                }
                if(peoples[idx] <= buses[i]) {
                    idx++;
                }
            }
            if(peoples.length == idx) break;
        }
        if(!target) {
            if(idx != 0) {
                end = peoples[--idx];
            }else {
                end = peoples[idx];
            }
            for(int k = idx ; k >= 0 ; k--) {
                if(end == peoples[0]) {
                    end = peoples[0] - 1;
                    if(end > buses[buses.length-1]) {
                        end = buses[buses.length-1];
                    }
                    break;
                }
                if(end != peoples[k]) {
                    end = peoples[k];
                    break;
                }
            }
        }

        return setTimeFormat(end);
    }

    // 결과 시간 포맷
    private String setTimeFormat(int time) {
        int hour = time / 60;
        int minutes = time - (hour*60);
        return ((hour < 10)?"0"+hour:hour) + ":" + ((minutes<10)?"0"+minutes:minutes);
    }

    // 시간 포멧 생성
    private int[] getTime(String[] timetable) {
        int[] result = new int[timetable.length];
        for(int i = 0 ; i < timetable.length ; i++) {
            result[i] = Integer.parseInt(timetable[i].split(":")[0]) * 60 +
                    Integer.parseInt(timetable[i].split(":")[1]);
        }
        Arrays.sort(result);
        return result;
    }

    // 버스 운행 포멧
    private int[] getBus(int n, int t) {
        int[] bus = new int[n];
        int idx = 0;
        int time = 540;
        do {
            bus[idx++] = time;
            time += t;
        }while(idx < n);

        return bus;
    }
}


/*
    // 첫 차 시간 = (시 * 60) + 분
    int arrive = 540;
    // 시간 포맷 적용
    int[] queue = getTime(timetable);
    // 현재 대기 위치
    int idx = 0;
    // 게으른 콘
    boolean con = false;
    // 도착한 버스 수
    int bus = 1;

    do {
        for(int i = idx ; i <= m ; i++) {
            if(i == queue.length) {

            }
            if(arrive > queue[i]) {
                idx = i;
                break;
            }
        }
        arrive += t;
        bus ++;
    }while(con != true || bus != n);
*/