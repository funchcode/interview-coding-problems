import Level3.KakaoBook;

/* Level3 실행 코드 */
public class Main3 {
    public static void main(String[] args) {
        KakaoBook kakaoBook = new KakaoBook();
        int[][] pic = new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        int[] result = kakaoBook.solution(6, 4, pic);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
