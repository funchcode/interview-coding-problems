package Level1;

import java.util.Arrays;

// 문제 설명
// : 배열과 숫자가 주어진다.
// : 배열안의 원소 중 숫자로 나누어 떨어지는 값을 오름차순으로 리턴하라.
// : 나누어 떨어지는 값이 없다면 -1을 배열에 담아서 리턴하라.

// 제한 사항
// : arr은 자연수를 담은 배열이다.
// : divisor은 자연수이다.
// : arr는 길이 1이상인 배열이다.

// 입출력 예
// 1 input : arr = [5,9,7,10]   divisor = 5
// 1 output : return = [5, 10]
// 2 input : arr = [2,36,1,3]   divisor = 1
// 2 output : return = [1,2,3,36]
// 3 input : arr = [3,2,6]   divisor = 10
// 3 output : return = [-1]
public class Divisor {
    public int[] solution(int[] arr, int divisor) {
        int location = 0;
        Arrays.sort(arr);
        for(int e : arr) {
            if(e%divisor == 0) {
                arr[location] = e;
                location ++;
            }
        }
        if(location==0) arr[location++] = -1;
        return Arrays.copyOf(arr, location);
    }
    public int[] version2(int[] array, int divisor) {
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
}
