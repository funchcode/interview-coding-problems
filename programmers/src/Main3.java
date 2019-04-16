import Level5.*;

/* Level5 실행 코드 */
public class Main3 {
    public static void main(String[] args) {
        
    }
}
/*카카오 후보키
        CandidateKey candidateKey = new CandidateKey();
        String[][] input = {
                {"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"}
                ,{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}
        };
        candidateKey.solution(input);
*/

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

/*카카오 뉴스 클러스터링
    JaccardIndex jaccardIndex = new JaccardIndex();
    String str1 = "FRENCH";
    String str2 = "FRANCE";
    String str5 = "aa1+aa2";
    String str6 = "AAAA12";
    String str3 = "E=M*C^2";
    String str4 = "e=m*c^2";
    System.out.println(jaccardIndex.solution(str1, str2));
*/

/*카카오 셔틀버스
    ShuttleBus shuttleBus = new ShuttleBus();
    String[] input1 = {
            "08:00", "08:01", "08:02", "08:03"
    };
    String[] input2 = {
            "09:10", "09:09", "08:00"
    };
    String[] input3 = {
            "09:00", "09:00", "09:00", "09:00"
    };
    String[] input4 = {
            "23:59"
    };
    shuttleBus.solution(1,1,5, input1);
    shuttleBus.solution(2,10,2, input2);
    shuttleBus.solution(2,1,2, input3);
    shuttleBus.solution(1,1,1, input4);
    shuttleBus.solution(10,60,45,input2);
*/

/*카카오 프렌즈블록
    FriendsBlock friendsBlock = new FriendsBlock();
    String[] input = {
            "CCBDE", "AAADE", "AAABF", "CCBBF"
    };
    String[] input1 = {
            "TTTANT",
            "RRFACC",
            "RRRFCC",
            "TRRRAA",
            "TTMMMF",
            "TMMTTJ"
    };
    String[] input2 = {
            "ABDEE",
            "BBCEE",
            "BBCDE",
            "ABCDE",
            "ABCDE"
    };
    System.out.println(friendsBlock.solution(4,5,input));
    System.out.println(friendsBlock.solution(6,6,input1));
    System.out.println(friendsBlock.solution(5,5,input2));
*/

/*캐시 크기에 따른 실행속도 구하기
    Cashing cashing = new Cashing ();
    String[] input = {
            "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"
    };
    String[] input1 = {
            "Jeju", "Pangyo", "Seoul", "NewYork", "LA"
    };
    System.out.println(cashing.solution(3, input));
    System.out.println(cashing.solution(0, input1));
*/

/*카카오 비밀지도
    SecretMap secretMap = new SecretMap();
    secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    secretMap.solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10});
*/

/*카카오 비밀채팅방
        OpenChat openChat = new OpenChat();
        String[] input = {
                "Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"
        };
        openChat.solution(input);
*/

/*카카오 오천성의 스테이지 실패율을 구해라
        FailureRate failureRate = new FailureRate();
        int[] input = {
                2, 1, 2, 6, 2, 4, 3, 3
        };
        int[] input1 = {
                1, 2, 3, 2, 2, 1, 1, 1
        };
        failureRate.solution(5, input);
        failureRate.solution(5, input1);
*/