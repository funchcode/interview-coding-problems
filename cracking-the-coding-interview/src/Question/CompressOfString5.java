package Question;

import java.lang.reflect.Array;
import java.util.*;

// 코딩 인터뷰 완벽 분석 *************
// 같은 문자가 연속으로 반복될 경우, 그 횟수를 사용해 문자열을 압축하는 메서드를 구현하라.
// 압축 결과가 입력 데이터의 길이가 같은 경우, 그대로 반환해야한다.
// 입력 예) aabccccccccaaa
// 출력 예) a2b1c8a3
public class CompressOfString5 {

    public String compression(String str) {
        String temp = "";
        char word = str.charAt(0);
        int count = 1;
        boolean overlap = false;
        for(int i = 1 ; i < str.toCharArray().length ; i++) {
            if(word == str.charAt(i)) {
                overlap = true;
                ++count;
                continue;
            }else {
                temp = temp + word + count;
                word = str.charAt(i);
                count = 1;
            }
        }
        temp = temp + word + count;

        return overlap?temp:str;
    }

    private boolean compareOrigin(String str) {
        return false;
    }


    public static void main(String[] args) {
        CompressOfString5 compressOfString = new CompressOfString5();
        String input = "aabccccccccaaa";
        String input2 = "abcde";
        System.out.println(compressOfString.compression(input2));
    }
}



/*
public void compress(String s) {
    String t = "";
    for (String u : s.split("(?<=(.))(?!\\1)"))
        t = t + u.charAt(0) + u.length();
    System.out.println(t);
}
    */