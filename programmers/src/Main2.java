import Level2.StockPrice;

import java.util.Arrays;

/* Level2 실행 코드 */
public class Main2 {

    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();
        System.out.println(Arrays.toString(stockPrice.solution(new int[]{1,2,3,2,3})));
    }
}

/*주식가격문제
    StockPrice stockPrice = new StockPrice();
    System.out.println(Arrays.toString(stockPrice.solution(new int[]{1,2,3,2,3})));
* */