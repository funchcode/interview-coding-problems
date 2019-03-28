import Level2.Skilltree;
import Level2.StockPrice;
import Level2.Tower;

import java.util.ArrayList;
import java.util.Arrays;

/* Level2 실행 코드 */
public class Main2 {

    public static void main(String[] args) {
        Tower tower = new Tower();
        for (int i : tower.solution(new int[]{1,5,3,6,7,6,5})) {
            System.out.println(i);
        }
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

* */