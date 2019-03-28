package Level2;

// 문제 설명
// : 평지에 탑 N대를 세웠는데 높이가 제 각기이다.
// : 탑 꼭대기에서 신호를 주고 받는데 신호를 보낸 탑보다 높은 탑에서만 수신가능하다.
// : 한 번 수신된 신호는 소멸된다.
// : 신호를 동시에 왼쪽으로 송신한다면 해당 탑들의 수신 신호의 갯수를 리턴하라.

// 제한 사항
// : heights는 길이 2이 100이하인 정수 배열이다.
// : 모든 탑의 높이는 1이상 100이하이다.
// : 신호를 수신하는 탑이 없으면 0으로 표시한다.

// 입출력 예
// 1 input : heights = [6,9,5,7,4]
// 1 output : [0,0,2,2,4]
// 2 input : heights = [3,9,9,3,5,7,2]
// 2 output : [0,0,0,3,3,3,6]
// 3 input : heights = [1,5,3,6,7,6,5]
// 3 output : [0,0,2,0,0,5,6]
public class Tower {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i = heights.length - 1 ; i >= 1 ; i--) {
            for(int j = i-1 ; j >= 0 ; j--) {
                if(heights[i] < heights[j]) {
                    answer[i] = j+1;
                    break;
                }
            }
        }
        return answer;
    }
}
