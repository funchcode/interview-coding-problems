package Level5;
import java.util.*;

// 문제 설명
// : 프랜즈 오천성이 사용자 유입을 위해 스테이지 난이도를 분석을 해야한다.
// : 난이도의 실패율을 구해서 실패율이 높은 라운드를 내림차순으로 출력하라.
// : 스테이지 개수는 N, 사용자가 멈춰있는 스테이지 번호 stages가 배열로 주어진다.
// : 실패율 = 스테이지에 도달했으나 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
// : N + 1은 모든 스테이지를 클리어한 사용자를 의미한다.
// : 실패율이 같은 스테이지는 작은 번호의 스테이지로 스테이지에 도달한 유저가 없는 경우 실패율은 0이다.

// 입출력 예
// 1 input : N = 5          stages = [2, 1, 2, 6, 2, 4, 3, 3]
// 1 output : result = [3,4,2,1,5]
public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] clear = new int[N+1];
        int[] now = new int[N+1];
        double[] store = new double[N];

        Arrays.sort(stages);
        for(int e : stages) {
            now[e-1] += 1;
            for(int i = 1 ; i <= e ; i++) {
                clear[i-1] += 1;
            }
        }

        for(int i = 0 ; i < N ; i++) {
            if(clear[i] == 0) {
                store[i] = 0;
                continue;
            }
            store[i] = (double)now[i]/clear[i];
        }
        double[] b = store.clone();
        Arrays.sort(b);
        for(int i = 0 ; i < answer.length ; i++) {
            for(int j = 0 ; j < store.length ; j++) {
                if (b[store.length-1 - i] == store[j]) {
                    answer[i] = j+1;
                    store[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
