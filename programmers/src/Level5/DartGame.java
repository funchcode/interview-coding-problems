package Level5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;
        Map<Integer, Double> score = new HashMap<>();
        char[] c = dartResult.toCharArray();
        String s = "";
        for(int i = 0 ; i < c.length ; i++) {
            int idx = score.size() - 1;
            if(c[i] == '#') {
                score.put(idx, score.get(idx) * -1);
                continue;
            }
            if(c[i] == '*') {
                if(idx != 0) {
                    score.put(idx-1, score.get(idx-1) * 2);
                }
                score.put(idx, score.get(idx) * 2);
                continue;
            }
            if(c[i] >= 68 && c[i] <= 84) {
                score.put(idx + 1, Math.pow(Double.parseDouble(s), (c[i]==68?2.0:c[i]==84?3.0:1.0)));
                s = "";
                continue;
            }
            s += c[i];
        }

        for(int i = 0 ; i < score.size() ; i ++) {
            answer += score.get(i);
        }

        return answer;
    }
}
