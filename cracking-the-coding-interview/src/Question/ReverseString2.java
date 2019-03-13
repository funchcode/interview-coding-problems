package Question;

import java.util.Arrays;

// 코딩 인터뷰 완벽 분석 *************
// 널 문자로 끝나는 문자열을 뒤집는 reverse(char* str)함수를 C나 C++로 구현하라.
public class ReverseString2 {

    // 문자열에서 널문자 '\0'이라고 가정
    public String reverse(String str) {
        char[] recombination = new char[str.length()-1];
        int endPoint = str.indexOf("\0")-1;
        for(int i = endPoint ; i >= 0 ; i--) {
            recombination[endPoint-i] = str.charAt(i);
        }
        return String.valueOf(recombination);
    }

    public static void main(String[] args) {
        String input = "0123456789\0";

        ReverseString2 reverseString = new ReverseString2();
        System.out.println(reverseString.reverse(input));
    }
}
