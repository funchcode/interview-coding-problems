package Question;

import java.util.LinkedList;

// 코딩 인터뷰 완벽 분석 *************
// 비정렬 연결 리스트에서 중복 문자를 제거하는 코드를 작성하라.
// 임시 버퍼가 허용되지 않는 상황에서 이 문제를 어떻게 해결할 것인가.
public class RemoveOverlap9 {

    public void removeOverlap(LinkedList<Integer> list) {

    }

    public static void main(String[] args) {
        RemoveOverlap9 removeOverlap = new RemoveOverlap9();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0 ; i < 5 ; i ++) {
            linkedList.add(i);
        }
        linkedList.add(3);
        linkedList.add(5);
        removeOverlap.removeOverlap(linkedList);
    }
}
