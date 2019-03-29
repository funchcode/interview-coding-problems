package Level2;

// 문제 설명
// : 트럭은 1초에 1만큼 움직이고 다리 폭이 좁아서 한대씩 순차적으로 들어올 수 있다.
// : 다리는 견딜 수 있는 무게제한이 있다.
// : 다리 길이 bridge_length와 무게제한 weight, 트럭들의 무게 truck_weights를 매개변수로 받는다.
// : 트럭들이 다리를 건너려면 몇 초가 걸리는지 구하라

// 제한 사항
// : bridge_length는 1이상 10,000이하이다.
// : weight는 1이상 10,000이하이다.
// : truck_weights의 무게는 1이상 10,000이하이다.
// : 모든 트럭의 무게는 1이상 weight이하이다.

// 입출력 예
// 1 input : bridge_length = 2      weight = 10         truck_weights=[7,4,5,6]
// 1 output : 8
// 2 input : bridge_length = 100      weight = 100         truck_weights=[10]
// 2 output : 101
public class BridgeTruck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int[] move = new int[truck_weights.length];
        int first = 0;
        int end = 0;
        int trucks= truck_weights[0];
        while(first < truck_weights.length) {
            answer ++ ;
            if(move[first] >= bridge_length) {
                trucks -= truck_weights[first];
                first ++;
            }
            if(end < truck_weights.length-1 && trucks + truck_weights[end+1] <= weight) {
                trucks += truck_weights[end+1];
                end ++;
            }
            for(int i = first ; i <= end ; i++) {
                move[i] += 1;
            }
        }
        return answer;
    }
}
