import Level1.PrintRequest;

public class Main {

public static void main(String[] args) {
    PrintRequest printRequest = new PrintRequest();
    System.out.println(printRequest.solution(new int[]{1,1,9,1,1,1}, 0)); // Test Case 1
    System.out.println(printRequest.solution(new int[]{2,1,3,2}, 2)); // Test Case 2
    }
}
