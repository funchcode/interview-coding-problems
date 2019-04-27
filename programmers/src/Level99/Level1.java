package Level99;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// a = JOB, rotate = 회전 수 모음
// a를 rotate 회전 수 만큼 회전 후 큰 수의 위치를 찾아 결과 값에 담아
// 리턴
public class Level1 {
    public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
        List<Integer> result = new ArrayList<>();
        for(Integer r : rotate) {
            int idx = a.size() - (r % a.size() - 1) + a.indexOf(Collections.max(a));
            result.add(idx>a.size()?idx-=a.size():idx);
        }
        return result;
    }
}

/* 제출했던 코드
    public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
        Integer[] result = new Integer[rotate.size()];  // 결과
        Integer[] job = a.toArray(new Integer[a.size()]);   // 잡큐
        Integer[] temp = Arrays.copyOf(job, job.length);    // 최대 값 제물
        Arrays.sort(temp);
        int max = temp[temp.length-1];  // 최대 값
        int turn, idx;
        int point = 0;  // 최대 값 위치
        for(int i = 0 ; i < a.size() ; i++) {
            if(a.get(i) == max) point = i;  // 해당 위치가 최대 값인가
        }
        for(int i = 0 ; i < rotate.size() ; i++) {
            turn = rotate.get(i);   // 회전 수
            idx = a.size() - (turn%a.size()-1) + point; // 최대 값의 위치
            if(idx>a.size()) idx-=a.size();
            result[i] = idx-1;
        }

        return new ArrayList<>(Arrays.asList(result));
    }
*/