import Level2.*;

import java.util.ArrayList;
import java.util.Arrays;

/* Level2 실행 코드 */
public class Main2 {

    public static void main(String[] args) {
        BridgeTruck bridgeTruck = new BridgeTruck();
        System.out.println(bridgeTruck.solution(2,10,new int[]{7,4,5,6}));
        System.out.println(bridgeTruck.solution(100,100,new int[]{10}));
    }
}

/*주식가격문제
    StockPrice stockPrice = new StockPrice();
    System.out.println(Arrays.toString(stockPrice.solution(new int[]{1,2,3,2,3})));
* */

/*선행스킬에 대한 처리
    Skilltree skilltree = new Skilltree();
    System.out.println(skilltree.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BD"}));
* */

/*높이가 제 각기인 탑의 수신위치를 구해라
    Tower tower = new Tower();
    for (int i : tower.solution(new int[]{1,5,3,6,7,6,5})) {
        System.out.println(i);
    }
* */

/*124 나라의 숫자
    WonderLand wonderLand = new WonderLand();
    System.out.println(wonderLand.solution(6));
* */

/* 기능 개발에 걸리는 속도를 구해라
    PushFunc pushFunc = new PushFunc();
    int[] answer = pushFunc.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
    for(int i : answer) {
        System.out.println(i);
    }
*/

/*모든 트럭들이 다리를 건넌 시간을 구해라

*/