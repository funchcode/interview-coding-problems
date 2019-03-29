package Level2;
import java.util.Arrays;
// 문제 설명
// : 어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 값을 구하라
// : 예를 들어 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있다. 이 중 가장 큰 숫자는 94이다.
// : 문자열 형식으로 숫자 number와 제거할 수 k개가 매개변수로 주어진다.

// 제한 사항
// : number은 1이상 1,000,000자리 이하인 숫자이다.
// : k는 1이상 number미만인 자연수이다.

// 입출력 예
// 1 input : number = "1924"        k = 2
// 1 output : "94"
// 2 input : number = "1231234"        k = 3
// 2 output : "3234"
public class Largest {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int start = 0;
        int end = number.length() - (number.length() - k);
        char[] ch;
        for(int i = 0 ; i < number.length() - k ; i ++) {
            ch = number.substring(start,end+1).toCharArray();
            Arrays.sort(ch);
            answer.append(ch[ch.length-1]);
            start += number.substring(start,end+1).indexOf(ch[ch.length-1]) + 1;
            end ++;
        }
        return answer.toString();
    }
}

/* 1차 시도 (속도 탈)
for(int i = 0 ; i < number.length() - k ; i ++) {
    for(int j = end ; j >= start ; j--) {
        if(number.charAt(temp) <= number.charAt(j)) {
            temp = j;
        }
    }
    answer.append(number.charAt(temp));
    start = temp + 1;
    end ++;
    temp = end;
}*/