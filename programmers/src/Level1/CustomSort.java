package Level1;

// 문제 설명
// : 문자열의 값을 가진 배열과 정수 n이 주어진다.
// : 문자열 n번째의 인덱스를 기준으로 오름차순으로 정렬하려고 해라.

// 제한 사항
// : 배열은 길이 1 이상, 50이하이다.
// : 배열의 문자열들은 소문자로 이루어져있다.
// : 원소의 길이는 1이상 100이하인 문자열이다.
// : 모든 원소의 길이는 정수 n보다 크다.
// : n의 위치인 원소가 같은 값이 여럿일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치

import java.util.ArrayList;
import java.util.Arrays;

// 입출력 예
// 1 input : strings = ["sun","bed","car"]      n = 1
// 1 output : return = ["car","bed","sun"]
// 2 input : strings = ["abce","abcd","cdx"]      n = 2
// 2 output : return = ["abcd","abce","cdx"]
public class CustomSort {
    public String[] solution(String[] strings, int n) {
        char[] answer = new char[strings.length];
        String temp;
        for(int i = strings.length-1 ; i >= 0 ; i --) {
            for(int j = 0 ; j < i ; j ++) {
                if(strings[j].charAt(n) > strings[i].charAt(n)) {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
            answer[i] = strings[i].charAt(n);
        }
        int startIndex = 0;
        for(int i = 0 ; i < answer.length-1 ; i ++) {
            if(answer[i] != answer[i+1]) {
                Arrays.sort(strings, startIndex, i+1);
                startIndex = i+1;
            }else if (i == answer.length - 2) {
                Arrays.sort(strings, startIndex, i+2);
            }
        }
        return strings;
    }
}
