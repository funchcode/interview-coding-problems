package Level2;
import java.util.Arrays;
// 문제 설명
// : 기능 개선 작업 중이다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있다.
// : 각 기능은 동시에 개발을 하지만 속도가 다르다. 뒤의 기능이 더 빨리 개발될 수 있다.
// : 뒤에 있는 기능은 앞에 기능이 배포될 때 같이 배포된다.
// : 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 배열 progresses
// : 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때
// : 각 배포마다 몇 개의 기능이 배포되는지 반환하라.

// 제한 사항
// : 작업의 개수, 속도의 길이는 100개 이하이다.
// : 작업 진도는 100미만의 자연수이다.
// : 작업 속도는 100미만의 자연수이다.
// : 배포는 하루에 한 번만 할 수 있다. 하루의 끝에 이루어진다고 가정.

// 입출력 예
// 1 input : progresses = [93, 30, 55]        speeds = [1, 30, 5]
// 1 output : [2, 1]
public class PushFunc {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        int day = (int)Math.ceil((100-progresses[0])/(double)speeds[0]);
        int idx = 0;
        for(int i = 0 ; i < progresses.length ; i ++) {
            if(progresses[i] + speeds[i] * day < 100) {
                idx ++;
                day = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);
            }
            answer[idx] += 1;
        }
        return Arrays.stream(answer).filter(e -> e != 0).toArray();
    }
}
