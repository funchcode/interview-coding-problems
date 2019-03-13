package Question;
// 코딩 인터뷰 완벽 분석 *************
// 주어진 문자열 내의 모든 공백을 %20으로 바꾸는 메서드를 작성하라.
// 입력 예제 ) [문자열][충분한공백],[문자열길이]
// 자바로 구현 시 문자 배열을 사용하여 필요한 연산을 각 문자에 바로 적용할 수 있도록 하라.
public class BlankToWord4 {

    public String blankToText(String str) {
        return str.substring(0, getLength(str)).replaceAll(" ", "%20");
    }

    private int getLength(String str) {
        return Integer.parseInt(str.split(",")[1].trim());
    }

    public static void main(String[] args) {
        BlankToWord4 blankToWord = new BlankToWord4();
        String input = "a bc de fg     , 10";
        System.out.println(blankToWord.blankToText(input));
    }
}
