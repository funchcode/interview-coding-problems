import Level1.MarathonFinish;
import Level1.MockTest;
import Level1.PrintRequest;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MockTest mockTest = new MockTest();
        for(int i : mockTest.solution(new int[]{1,3,2,4,2})) {
            System.out.println(i);
        }
    }
}

/*프린트 요청
    PrintRequest printRequest = new PrintRequest();
    System.out.println(printRequest.solution(new int[]{1,1,9,1,1,1}, 0)); // Test Case 1
    System.out.println(printRequest.solution(new int[]{2,1,3,2}, 2)); // Test Case 2
 * */

/*완주하지 못한 마라톤 선수
    MarathonFinish marathonFinish = new MarathonFinish();
    marathonFinish.solution(new String[]{"leo","kiki","eden"}, new String[]{"eden","kiki"});
* */

/*누가 제일 잘 찍었나 수포자
    MockTest mockTest = new MockTest();
    for(int i : mockTest.solution(new int[]{1,3,2,4,2})) {
        System.out.println(i);
    }
* */