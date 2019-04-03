import Level2.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Level2 실행 코드 */
public class Main2 {

    public static void main(String[] args) {
        Spy spy = new Spy();
        System.out.println(spy.solution(new String[][]{{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}}));
        System.out.println(spy.solution(new String[][]{{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}}));
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
    BridgeTruck bridgeTruck = new BridgeTruck();
    System.out.println(bridgeTruck.solution(2,10,new int[]{7,4,5,6}));
    System.out.println(bridgeTruck.solution(100,100,new int[]{10}));
*/

/*경우의 수 중 가장 큰 값을 구하라
    Largest largest = new Largest();
    System.out.println(largest.solution("4177252841",4));
    System.out.println(largest.solution("1231234",3));
*/

/*구명보트 최대한 적게 사용해서 사람을 구출해라
    Lifeboat lifeboat = new Lifeboat();
    System.out.println(lifeboat.solution(new int[]{70,50,80,50}, 100));
    System.out.println(lifeboat.solution(new int[]{70,50,80}, 100));
*/

/*조이스틱으로 이름 생성
    JoyStick joyStick = new JoyStick();
    System.out.println(joyStick.solution("JEROEN"));
*/

/*스파이 의상을 리턴하라
    Spy spy = new Spy();
    System.out.println(spy.solution(new String[][]{{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}}));
    System.out.println(spy.solution(new String[][]{{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}}));
*/