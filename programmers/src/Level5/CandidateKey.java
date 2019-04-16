package Level5;

import java.util.*;

// 문제 설명
// : 학생들의 인적사항을 데이터베이스에 넣기 위한 후보키에 대한 고민
// : 관계 데이터베이스에서 유일성과 최소성을 만족하는 것이 후보키라고 한다.
// : 유일성 : 릴레이션에 있는 튜플들이 모두 유일해야 한다.
// : 최소성 : 유일하게 식별하는 데 꼭 필요한 속성이어야만 한다.
// : 후보키의 개수를 출력하라.

// 제한 사항
// : 입력 : relation 2차원 문자배열
// : 1 <= row <= 20
// : 1 <= column <= 8
// : 중복되는 튜플은 없다.

// 입출력 예
// 1 input : relation = [["100", "ryan", "music", "2"], ["200", "apeach", "math", "2"], ["300", "tube", "computer", "3"], ["400", "con", "computer", "4"], ["500", "muzi", "music", "3"], ["600", "apeach", "music", "2"]]
// 1 output : result = 2
public class CandidateKey {
    public int solution(String[][] relation) {
        List<Integer> list = new ArrayList<>();
        int columns = relation[0].length;
        int rows = relation.length;

        for(int i = 1 ; i < (1<<columns) ; i++) {
            Set<String> key = new HashSet<>();

            for(int j = 0 ; j < rows ; j++) {
                String temp = "";
                for(int k = 0 ; k < columns ; k++) {
                    if((i & (1<<k)) > 0) {
                        temp += relation[j][k];
                    }
                }
                key.add(temp);
            }
            if(key.size()==rows && isUniq(list, i)) {
                list.add(i);
            }
        }

        return list.size();
    }

    private boolean isUniq(List<Integer> list, int bm) {
        for(int i = 0 ; i < list.size() ; i++) {
            if((list.get(i) & bm) == list.get(i)) {
                return false;
            }
        }
        return true;
    }
}
