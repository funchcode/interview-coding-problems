package Level1;
import java.util.*;

// 문제 설명
// : 배열 Array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구해라.
// : 배열 Array와 i,j,k 2차원 배열을 매개변수로 받는다.

// 제한 사항
// : array의 길이는 1이상 100이하이다.
// : array의 각 원소는 1이상 100이하이다.
// : commands의 길이는 1이상 50이하이다.
// : commands의 각 원소는 길이가 3입니다.

// 입출력 예
// 1 input : array = [1,5,2,6,3,7,4]    commands = [[2,5,3],[4,4,1],[1,7,3]]
// 1 output : [5,6,3]
public class FindKth {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> temp;
        for(int i = 0 ; i < commands.length ; i ++) {
            temp = new ArrayList<>();
            for(int j = commands[i][0]-1 ; j <= commands[i][1]-1 ; j ++) {
                temp.add(array[j]);
            }
            Collections.sort(temp);
            answer[i] = temp.get(commands[i][2]-1);
        }

        return answer;
    }

    public int[] version2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0 ; i < commands.length ; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }

        return answer;
    }

}
