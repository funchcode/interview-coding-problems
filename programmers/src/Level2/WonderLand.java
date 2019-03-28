package Level2;

// 문제 설명
// : 124나라가 있는데 이 나라는 10진법이 아니라 자신들만의 규칙으로 수를 표현한다.
// : 자연수만 존재하고, [1,2,4]로 모든 수를 표현한다.
// : 10진수를 매개변수로 주면 124나라에서 사용하는 표현으로 반환하라.

// 제한 사항
// : 매개변수는 500,000,000이하의 자연수이다.

// 입출력 예
// https://programmers.co.kr/learn/courses/30/lessons/12899?language=java
public class WonderLand {
    public String solution(int n) {
        String answer = "";
        int[] nation = new int[]{1,2,4};
        while(n != 0) {
            n = n - 1;
            answer = nation[n % 3] + answer;
            n = n / 3;
        }

        return answer;
    }
}