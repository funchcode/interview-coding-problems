import Level1.MarathonFinish;
import Level1.PrintRequest;

import java.util.Arrays;

public class Main {

public static void main(String[] args) {
    MarathonFinish marathonFinish = new MarathonFinish();
    marathonFinish.solution(new String[]{"leo","kiki","eden"}, new String[]{"eden","kiki"});
    }
}

/*1번문제.
    PrintRequest printRequest = new PrintRequest();
    System.out.println(printRequest.solution(new int[]{1,1,9,1,1,1}, 0)); // Test Case 1
    System.out.println(printRequest.solution(new int[]{2,1,3,2}, 2)); // Test Case 2
 * */