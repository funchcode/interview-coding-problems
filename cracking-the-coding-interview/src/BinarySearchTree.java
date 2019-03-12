import java.lang.reflect.Array;
import java.util.ArrayList;

// INSERT, DELETE, SEARCH
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(int data) {
        this.root = new Node(data);
    }
    // 각 각의 노드
    private class Node {
        private int data;
        private Node parent;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.parent = null;
            this.left = null;
            this.right = null;
        }
    }
    // INSERT 메서드
    public void addData(int data) {
        Node newNode = new Node(data);
        Node targetNode = this.root;
        // 들어온 값과 존재 하는 값을 비교하며 내려간다(LEFT, RIGHT). 더 이상 내려갈 곳이 없을 경우(null) 위치가 된다.
        while(targetNode != null){
            if(targetNode.data > newNode.data) {
                if(targetNode.left == null) {
                    targetNode.left = newNode;
                    newNode.parent = targetNode;
                    break;
                }
                targetNode = targetNode.left;
            }else {
                if(targetNode.right == null) {
                    targetNode.right = newNode;
                    newNode.parent = targetNode;
                    break;
                }
                targetNode = targetNode.right;
            }
        }
    }
    // SEARCH 메서드(1) inorder 순회
    public String searchInorder() {
        inorder(this.root);
        return null;
    }
    private void inorder(Node node) {
        if(node != null) {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }
    // SEARCH 메서드(2) preorder 순회
    public String searchPreorder() {
        preorder(this.root);
        return null;
    }
    private void preorder(Node node){
        if(node != null) {
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    // SEARCH 메서드(3) postorder 순회
    public String searchPostorder() {
        postorder(this.root);
        return null;
    }
    private void postorder(Node node) {
        if(node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }

    // DELETE
    public void delete(int target) {

    }
}