package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문제 설명
// : 수포자(:수학을 포기한 사람의 준말) 삼인방이 모의고사에서 수학문제를 전부 찍으려고 한다.
// : 1번 수포자는 = 1 2 3 4 5 1 2 3 4 5 ... 로 찍는다.
// : 2번 수포자는 = 2 1 2 3 2 4 2 5 2 1 2 3 2 4 2 5 ... 로 찍는다.
// : 3번 수포자는 = 3 3 1 1 2 2 4 4 5 5 3 3 1 1 2 2 4 4 5 5 ... 로 찍는다.
// : 1번 문제부터 마지막 문제까지의 답이 담긴 배열 answer이 주어진다.
// : 가장 많이 맞힌 사람이 누구인지 return하라.

// 제한 사항
// : 시험은 최대 10,000문제로 구성되어있다.
// : 문제의 정답은 1 2 3 4 5 중 하나이다.
// : 가장 높은 점수를 받은 사람이 여러 명일 경우 return하는 값을 오름차순으로 정렬

// 입출력 예
// 1 input : answer [1,2,3,4,5]
// 1 output : 1
public class MockTest {
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> correct = new ArrayList<>();
        List<Integer[]> great = new ArrayList<>();
        int count;
        great.add(new Integer[]{1,2,3,4,5});
        great.add(new Integer[]{2,1,2,3,2,4,2,5});
        great.add(new Integer[]{3,3,1,1,2,2,4,4,5,5});
        for(int i = 0 ; i < great.size() ; i++) {
            count = 0;
            for(int j = 0 ; j < answers.length ; j++) {
                if(answers[j] == great.get(i)[j%great.get(i).length]) {
                    count ++;
                }
            }
            correct.add(i, count);
        }
        int max = Collections.max(correct);
        answer = new int[Collections.frequency(correct, max)];
        int j = 0;
        for(int i = 0 ; i < correct.size() ; i ++) {
            if(correct.get(i) == max) {
                answer[j] = i+1;
                j++;
            }
        }

        return answer;
    }
}
