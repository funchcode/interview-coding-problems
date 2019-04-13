import Level3.GoodDayIU;
import Level3.KakaoAd;
import Level3.KakaoBook;

/* Level3 실행 코드 */
public class Main3 {
    public static void main(String[] args) {
        GoodDayIU iu = new GoodDayIU();
        System.out.println(iu.solution(41));
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