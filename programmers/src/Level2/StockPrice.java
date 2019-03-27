package Level2;

// 문제 설명(프로그래머스에서 나온 지문은 무시.)
// : 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개 변수로 주어진다.
// x : 가격이 떨어지지 않은 기간은 몇 초인지 return하는 함수를 작성하라.
// : 가격이 떨어지지 않고 유지한 기간은 몇 초인지 return하는 함수를 작성하라.

// 제한 사항
// : prices의 각 가격은 1이상 10,000이하입니다.
// : prices의 길이는 2이상 100,000이하입니다.

// 입출력 예
// 1 input : prices = [1,2,3,2,3]
// 1 output : return = [4,3,1,1,0]
public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int temp;
        for(int i = 0 ; i < prices.length - 1 ; i ++) {
            temp = 0;
            for(int j = i + 1 ; j < prices.length ; j ++) {
                temp += 1;
                if(prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = temp;
        }
        return answer;
    }
}
