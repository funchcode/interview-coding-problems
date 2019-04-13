import Level3.GoodDayIU;
import Level3.KakaoAd;
import Level3.KakaoBook;
import Level3.Traffic;

import java.text.SimpleDateFormat;

/* Level3 실행 코드 */
public class Main3 {
    public static void main(String[] args) {
    }
}

/*카카오 프렌즈 컬러링 북
    KakaoBook kakaoBook = new KakaoBook();
    int[][] pic = new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
    int[] result = kakaoBook.solution(6, 4, pic);
    for (int i : result) {
        System.out.println(i);
    }
* */

/*카카오 광고글 차단
    KakaoAd kakaoAd = new KakaoAd();
    System.out.println(kakaoAd.solution("HaEaLaLaObWORLDb"));
* */

/*카카오 4단 고음
    GoodDayIU iu = new GoodDayIU();
    System.out.println(iu.solution(41));
*/

/*카카오 초당 최대 로그 처리량을 구해라
    Traffic traffic = new Traffic();
    String[] input1 = {
            "2016-09-15 20:59:57.421 0.351s",
            "2016-09-15 20:59:58.233 1.181s",
            "2016-09-15 20:59:58.299 0.8s",
            "2016-09-15 20:59:58.688 1.041s",
            "2016-09-15 20:59:59.591 1.412s",
            "2016-09-15 21:00:00.464 1.466s",
            "2016-09-15 21:00:00.741 1.581s",
            "2016-09-15 21:00:00.748 2.31s",
            "2016-09-15 21:00:00.966 0.381s",
            "2016-09-15 21:00:02.066 2.62s"
    };
    String[] input3 = {
            "2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s"
    };
    String[] input2 = {
            "2016-09-15 01:00:04.002 2.0s",
            "2016-09-15 01:00:07.000 2s"
    };
    traffic.solution(input1);
    traffic.solution(input2);
    traffic.solution(input3);
*/