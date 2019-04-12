package Level3;

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
    boolean[][] maps;
    int[][] pic;

    public int[] solution(int m, int n, int[][] picture) {
        pic = picture;
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        maps = new boolean[m][n];

        for(int i = 0 ; i < picture.length ; i++) {
            for(int j = 0 ; j < picture[i].length ; j++) {
                if(picture[i][j] != 0 && maps[i][j] == false) {
                    ++numberOfArea;
                    int sum = traversal(i, j);
                    if(sum > maxSizeOfOneArea) {
                        maxSizeOfOneArea = sum;
                    }
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public int traversal(int x, int y) {
        int sum = 1;
        maps[x][y] = true;

        if(x > 0 && pic[x-1][y] == pic[x][y] && maps[x-1][y] == false) {
            sum += traversal(x-1, y);
        }
        if(x+1 < maps.length && maps[x+1][y] == false && pic[x][y] == pic[x+1][y]) {
            sum += traversal(x+1, y);
        }
        if(y > 0 && pic[x][y-1] == pic[x][y] && maps[x][y-1] == false) {
            sum += traversal(x, y-1);
        }
        if(y + 1 < maps[x].length && maps[x][y+1] == false && pic[x][y] == pic[x][y+1]) {
            sum += traversal(x, y+1);
        }

        return sum;
    }

}
