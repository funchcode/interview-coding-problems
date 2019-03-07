// Goal :
// 앞에서 데이터 추가
// 중간에 데이터 삽입&삭제
// 현재 Node의 수 반환
public class LinkedList {
    private Node head;
    private Node tail;
    private int count = 0;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object input) {
            this.data = input;
        }
    }

    public void addLast(Object input) {
        if(count == 0) {
            addFirst(input);
        } else {
            Node newNode = new Node(input);
            tail.next = newNode;
            tail = newNode;
            count++;
        }

    }
    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        count++;

        if(head.next == null) {
            tail = head;
        }
    }
    public void addNth(Object input, int idx) {
        if(count == idx) {
            addFirst(input);
        }else if(count >= idx) {
            Node temp1 = node(idx-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            count++;
        }else {
            // 에러
        }
    }
    public void removeNth(int idx) {
        if(idx == 0) {
            // 예외
        }else if(count >= idx){
            Node temp1 = node(idx);
            Node toDoDeletedData = temp1.next;
            temp1.next = toDoDeletedData.next;
            if(toDoDeletedData == tail) {
                tail = temp1;
            }
            toDoDeletedData = null;
            count--;
        }else {
            // 예외
        }
    }
    public Node node(int index) {
        Node x = head;
        for(int i = 0 ; i < index ; i++) {
            x = x.next;
        }
        return x;
    }
}
