package Question;
// 코딩 인터뷰 완벽 분석 *************
// 문자열 두 개를 입력으로 받아 그중 하나가 다른 하나의 순열인지 판단하는 메서드를 작성하라.
public class ComparePermutation3 {

    public void permutation(String str1, String str2) {
        char[] buffer = str1.toCharArray();


    }

    public static void main(String[] args) {
        ComparePermutation3 comparePermutation = new ComparePermutation3();
        String input1 = "abc";
        String input2 = "bcabcabca";
        comparePermutation.permutation(input1, input2);
    }
}
