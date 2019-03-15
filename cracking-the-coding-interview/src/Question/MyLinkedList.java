package Question;

public class MyLinkedList {
    private Node root;

    // 리스트 첫 생성
    public MyLinkedList(Integer data) {
        this.root = new Node(data);
    }
        

    // 각 요소
    private class Node {
        private Integer data;
        private Node next;
        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }
}
