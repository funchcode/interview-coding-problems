package Level5;
import java.util.*;

// 문제 설명
// : 두 팀이 다른 순서로 같은 곳을 방문해야 한다.
// : 특별한 규칙으로 노드를 구성한다.
// : 자식노드는 부모노드보다 y의 값이 클 수 없다.
// : 부모노드의 x값보다 작으면 왼쪽 자식노드 x값보다 크면 오른쪽 자식노드로 결정된다.
// : 모든 노드는 서로 다른 x의 값을 가진다.
// : 한 팀은 전위 순회의 방법, 다른 한 팀은 후위 순회 방법으로 방문한다.
// : 각 팀들이 방문한 노드를 2차원 배열에 순서대로 담아서 출력하라.

// 입출력 예
// 1 input : nodeinfo = [{5,3},{11,5},{13,3},{3,5},{6,1},{1,3},{8,6},{7,2},{2,2}]
// 1 output :  result = [[7, 4, 6, 9, 1, 8, 5, 2, 3], [9, 6, 5, 8, 1, 4, 3, 2, 7]]
public class KakaoGame {
    List<Node> nodes = new ArrayList<>();
    int idx = 0;
    class Node {
        int x, y, index;
        Node left, right;
        Node(int index, int x, int y) {
            this.index = index;
            this.x = x;
            this.y = y;
        }
    }

    private void addNode(Node parent, Node child) {
        if(parent.x < child.x) {
            if(parent.right != null) {
                addNode(parent.right, child);
            }else {
                parent.right = child;
            }
        }else {
            if(parent.left != null) {
                addNode(parent.left, child);
            }else {
                parent.left = child;
            }
        }
    }

    private void preorder(int[][] answer, Node node) {
        if(node == null) return;
        answer[0][idx++] = node.index;
        preorder(answer, node.left);
        preorder(answer, node.right);

    }

    private void postorder(int[][] answer, Node node) {
        if(node == null) return;
        postorder(answer, node.left);
        postorder(answer, node.right);

        answer[1][idx++] = node.index;
    }

    Comparator<Node> compareNode = new Comparator<Node>() {
        @Override
        public int compare(Node a, Node b) {
            if(b.y == a.y) return a.x-b.x;

            return b.y-a.y;
        }
    };

    public int[][] solution(int[][] nodeinfo) {
        int[][] answer = new int[2][nodeinfo.length];
        int size = nodeinfo.length;

        for(int i = 0 ; i < size ; i++) {
            nodes.add(new Node(i+1, nodeinfo[i][0], nodeinfo[i][1]));
        }

        nodes.sort(compareNode);
        Node root = nodes.get(0);
        for(int i = 1 ; i < nodes.size() ; i++) {
            addNode(root, nodes.get(i));
        }

        preorder(answer, root);
        idx = 0;
        postorder(answer, root);

        return answer;
    }
}
