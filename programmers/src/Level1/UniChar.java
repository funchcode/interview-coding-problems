package Level1;

import java.util.Arrays;
// 문제 설명
// : 배열이 주어진다. 배열의 각 원소는 0 ~ 9까지로 이루어진 수이다.
// : 같은 값이 연속인 것들을 제거한 값을 리턴하라.

// 제한 사항
// : 배열 arr의 크기는 1,000,000이하의 자연수
// : 배열 arr의 원소의 크기는 0 ~ 9 의 정수

// 입출력 예
// 1 input : arr = [1,1,3,3,0,1,1]
// 1 output : return = [1,3,0,1]
// 2 input : arr = [4,4,4,3,3]
// 2 output : return = [4,3]
public class UniChar {
    public int[] solution(int []arr) {
        int standard = -1;
        int index = 0;
        for(int c : arr) {
            if(standard != c) {
                arr[index] = c;
                standard = c;
                index += 1;
            }
        }
        return Arrays.copyOf(arr, index);
    }
}
