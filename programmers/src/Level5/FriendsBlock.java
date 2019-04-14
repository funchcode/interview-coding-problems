package Level5;
import java.util.ArrayList;
import java.util.List;

// 문제 설명
// : 프렌즈 블록 게임이 있다. 2x2 같은 모양일 경우 제거되는 게임이다.
// : 2x2 같은 모양을 모두 제거 한 후 빈 공간을 위에서 아래로 채운다.
// : 채운 블록 중 2x2가 있으면 또 제거한다.
// : 제거된 블록의 개수를 구해라

// 입출력 예
// 1 input : m= 4    n= 5     board= "CCBDE", "AAADE", "AAABF", "CCBBF"
// 1 output : answer = 14
// 2 input : m= 6    n= 6     board="TTTANT","RRFACC","RRRFCC","TRRRAA","TTMMMF","TMMTTJ"
// 2 output : answer = 15
public class FriendsBlock {
    public int solution(int m, int n, String[] board) {
        List<char[]> boards = new ArrayList<>();
        for(String e : board) {
            boards.add(e.toCharArray());
        }
        return search(boards, m, n);
    }

    private int search(List<char[]> board, int x, int y) {
        char target;
        List<int[]> targets;
        int deleted = 0;
        int count = -1;

        while(count != 0) {
            // 블록 찾기
            targets = new ArrayList<>();
            for (int i = 0; i < x - 1; i++) {
                for (int j = 0; j < y - 1; j++) {
                    target = board.get(i)[j];
                    if (target == '0') {
                        continue;
                    }
                    if ((board.get(i+1)[j] == target)
                            && (board.get(i)[j+1] == target)
                            && (board.get(i+1)[j+1] == target)) {
                        targets.add(new int[]{i,j});
                    }
                }
            }
            // 블록 제거(=0치환)
            int[] point;
            count = 0;
            for(int i = 0 ; i < targets.size() ; i++) {
                point = targets.get(i);
                if(board.get(point[0])[point[1]] != '0') {
                    board.get(point[0])[point[1]] = '0';
                    count ++;
                }
                if(board.get(point[0] + 1)[point[1]] != '0') {
                    board.get(point[0] + 1)[point[1]] = '0';
                    count ++;
                }
                if(board.get(point[0])[point[1] + 1] != '0') {
                    board.get(point[0])[point[1] + 1] = '0';
                    count ++;
                }
                if(board.get(point[0] + 1)[point[1] + 1] !='0') {
                    board.get(point[0] + 1)[point[1] + 1] = '0';
                    count ++;
                }
            }
            System.out.println("deleted = " +deleted);
            System.out.println("count = " +count);
            deleted += count;

            // 블록위치 변경
            for(int i = 0 ; i < y ; i++) {
                for(int j = x-1 ; j > 0 ; j--) {
                    if( board.get(j)[i] == '0') {
                        for(int k = j-1 ; k >= 0 ; k--) {
                            if(board.get(k)[i] != '0') {
                                board.get(j)[i] = board.get(k)[i];
                                board.get(k)[i] = '0';
                                break;
                            }
                        }
                    }
                }
            }
        }

        return deleted;
    }
}

/*
    for(int i = 0 ; i < board.size() ; i++) {
        System.out.println(board.get(i));
    }
*/