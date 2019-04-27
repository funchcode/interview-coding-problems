package Level99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// issuePriorities에는 우선순위 있다.
// 우선순위를 최솟값으로 변경해라.
public class Level2 {
    public static List<Integer> reassignedPriorities(List<Integer> issuePriorities) {
        List<Integer> result = new ArrayList<>();
        int[] priorities = new int[99];
        List<Integer> sort = new ArrayList<>(issuePriorities);
        Collections.sort(sort);
        int num = 0;
        for(Integer p : sort) {
            if(priorities[p]==0) priorities[p] = ++num;
        }
        for(Integer i : issuePriorities) {
            result.add(priorities[i]);
        }
        return result;
    }
}

/* 제출했던 코드
        List<Integer> result = new ArrayList<>();   // 결과
        List<Integer> sort = new ArrayList<>(issuePriorities);  // 우선순위 정렬 제물
        Collections.sort(sort);
        int[] order = new int[100]; // 우선순위 1~99까지 존재
        int count = 0;  // 우선순위
        for (int i = 0 ; i < sort.size() ; i ++) {
            if(order[sort.get(i)] == 0) {
                order[sort.get(i)] = ++count;   // 해당 우선순위 숫자를 바꿀 수로 담기
            }
        }
        for (int i = 0 ; i < issuePriorities.size() ; i++) {
            result.add(order[issuePriorities.get(i)]);  // 바뀐 우선순위 수 가져오기
        }

        return result;
*/