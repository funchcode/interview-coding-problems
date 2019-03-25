package Level1;

// 문제 설명
// : 단어에서 가운데 글자를 추출해내라.
// : 단어의 길이가 짝수라면 두글자를 반환하면 된다.

// 제한 사항
// : 단어의 길이는 1이상 100이하인 스트링이다.

// 입출력 예
// 1 input : 단어 = "abcde"
// 1 output : return = "c"
// 2 input : 단어 = "qwer"
// 2 output : return = "we"
public class MiddleExtraction {
    public String solution(String s) {
        return (s.length()%2==1 ? s.substring(s.length()/2, s.length()/2 + 1) : s.substring(s.length()/2 - 1, s.length()/2 + 1));
    }

    public String version2(String s) {
        return s.substring((s.length()-1)/2, s.length()/2 + 1);
    }
}
