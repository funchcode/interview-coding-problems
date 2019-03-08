// Goal :
// head 먼저 입력된 것, tail 나중에 입력된 것
// 삭제(Dequeue), 추가(Enqueue)
public class Queue {
    private Node head;
    private Node tail;
    private int count;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object input) {
            this.data = input;
        }
    }

    void enqueue(Object input) {
        Node newNode = new Node(input);
        if(count == 0) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    void dequeue() {
        if(head == tail) {
            head = null;
            tail = null;
            count--;
        }else if(count == 0){
            // 예외
        }else {
            Node temp = head.next;
            head = null;
            head = temp;
            count--;
        }
    }
}