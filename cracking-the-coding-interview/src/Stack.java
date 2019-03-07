// Goal :
// 추가(push), 삭제(pop), 현재(peek)
public class Stack {
    private Node head;
    private int count = 0;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object input) {
            this.data = input;
        }
    }

    // 데이터 추가
    void push(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        count++;
    }
    
    // 데이터 삭제
    void pop() {
        if(count == 0) {
            // 예외처리
        }
        Node tempNode = head.next;
        head = null;
        head = tempNode;
        count--;
    }

    // 맨 마지막 데이터
    Object peek() {
        return head;
    }

    // 갯수
    int getCount() {
        return count;
    }

    // 데이터
    void getString() {
        Node temp = head;
        for(int i = 0 ; i < count ; i++) {
            System.out.println(String.valueOf(temp.data));
            temp = temp.next;
        }
    }
}