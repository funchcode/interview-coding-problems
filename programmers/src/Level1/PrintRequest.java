package Level1;

import java.util.ArrayList;
import java.util.List;

// 문제 설명
// : 일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄한다.
// : 1) 인쇄 대기목록에서 가장 앞에 있는 문서J를 꺼낸다.
// : 2) 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록 가장 마지막에 넣는다.
// : 3) 그렇지 않으면 J를 인쇄한다.

// 입출력 예
// input : priorities[ 2, 1, 3, 2 ], location[ 2 ]
// output : 1
public class PrintRequest {

    public int solution(int[] priorities, int location) {
        List<Integer> list = new ArrayList<Integer>();
        for(int priority : priorities) {
            list.add(priority);
        }

        int turn = 1;
        while (!list.isEmpty()) {
            final Integer j = list.get(0);
            if(list.stream().anyMatch(e-> j < e)) {
                list.add(list.remove(0));
            } else {
                if(location == 0) {
                    return turn;
                }
                list.remove(0);
                turn++;
            }
            if(location > 0) {
                location --;
            }else {
                location = list.size() -1;
            }
        }
        throw new IllegalArgumentException();
    }
}
