package Level2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
// 문제 설명
// : 스파이들은 매일 다른 옷을 조합하여 입어 위장한다.
// : 스파이가 가진 의상 2차원 배열을 매개변수로 주어진다. clothes
// : 서로 다른 옷의 조합을 return하도록 함수를 작성해라.

// 제한 사항
// : clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있다.
// : 스파이가 가진 의상의 수는 1이상 30개 이하이다.
// : 같은 이름을 가진 의상은 없다.
// : clothes의 모든 원소는 문자열로 이루어져 있다.
// : 모든 문자열의 길이는 1이상 20이하의 자연수이고, 알파벳 소문자 또는 '_'로 이루어져 있다.
// : 스파이는 하루에 최소 하나의 의상은 입는다.

// 입출력 예
// 1 input : clothes = [[yellow_hat, headgear], [blue_sunglasses, eyewear], [green_turban, headgear]]
// 1 output : 5
// 2 input : clothes = [[crow_mask, face], [blue_sunglasses, face], [smoky_makeup, face]]
// 2 output : 3
public class Spy {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> dress = new HashMap<>();
        for(String[] c : clothes) {
            if(dress.get(c[1]) == null) {
                dress.put(c[1], 0);
            }
            dress.put(c[1], dress.get(c[1])+1);
        }
        Iterator<String> keys = dress.keySet().iterator();

        while(keys.hasNext()) {
            String key = keys.next();
            answer *= dress.get(key) + 1;
            System.out.println("+"+answer);
        }

        answer --;

        return answer;
    }
}
