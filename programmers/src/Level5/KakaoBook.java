package Level3;

import java.util.Stack;

// 문제 설명
// : 카카오 프렌즈 컬러링 북
// : 컬러링 북에 있는 몇 개의 영역과 영역 중 가장 큰 범위의 수를 구해라.
// : 영역은 상하좌우로 연결되어 있는 부분이 한 영역으로 구성된다.
// : 그림의 크기를 나타내는 m, n 그리고 그림을 나타내는 mxn을 2차원배열로 picture가 주어진다.

// 제한 사항
// : picture의 원소 값 중 0은 색칠되지 않는 영역이다. 영역에서 포함되지 않는다.
// : 1 <= m, n <= 100

// 입출력 예
// 1 input : m = 6    n = 4       picture = [[1, 1, 1, 0], [1, 2, 2, 0], [1, 0, 0, 1], [0, 0, 0, 1], [0, 0, 0, 3], [0, 0, 0, 3]]
// 1 output : [4, 5]
public class KakaoBook {
    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        boolean[][] maps = new boolean[m][n];
        Stack<Integer> mapX = new Stack<>();
        Stack<Integer> mapY = new Stack<>();

        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j++) {
                int count = 0;
                if(picture[i][j] > 0 && maps[i][j] == false) {
                    plus(mapX, mapY, maps, j, i);
                    count++;
                    answer[0] ++;
                }

                while(!mapX.empty()) {
                    int x = mapX.pop();
                    int y = mapY.pop();
                    // 위로
                    if(y > 0 && picture[i][j] == picture[y-1][x] && maps[y-1][x] == false) {
                        plus(mapX, mapY, maps, x, y-1);
                        count++;
                    }
                    // 좌측
                    if(x > 0 && picture[i][j] == picture[y][x-1] && maps[y][x-1] == false) {
                        plus(mapX, mapY, maps, x-1, y);
                        count++;
                    }
                    // 아래
                    if(y < m-1 && picture[i][j] == picture[y+1][x] && maps[y+1][x] == false) {
                        plus(mapX, mapY, maps, x, y+1);
                        count++;
                    }
                    // 우측
                    if(x < n-1 && picture[i][j] == picture[y][x+1] && maps[y][x+1] == false) {
                        plus(mapX, mapY, maps, x+1, y);
                        count++;
                    }
                }
                answer[1] = Math.max(answer[1], count);
            }
        }
        return answer;
    }

    public static void plus(Stack x, Stack y, boolean[][] map, int j, int i) {
        x.add(j);
        y.add(i);
        map[i][j] = true;
    }
}
