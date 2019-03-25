import Level1.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.solution(1, 1));
        System.out.println(leapYear.solution(5, 24));
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

/*i번째부터 j번째 숫자까지 자르고 원하는 k번째 수 구하기
    FindKth findKth = new FindKth();
    int [] result = findKth.solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}});
    for(int i : result) {
        System.out.println(i);
    }
* */

/*체육시간에 체육복을 지참해서 출석한 학생의 최대값을 구하라
    Uniform uniform = new Uniform();
    System.out.println(uniform.solution(5, new int[]{2,4}, new int[]{1,3,5}));
    System.out.println(uniform.solution(5, new int[]{2,4}, new int[]{3}));
    System.out.println(uniform.solution(3, new int[]{3}, new int[]{1}));
* */

/*
*
* */