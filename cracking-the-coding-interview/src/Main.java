public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Stack stack = new Stack();
        stack.push("1번");
        System.out.println(stack.getCount());
        stack.push("2번");
        System.out.println(stack.getCount());
        stack.pop();
        stack.getString();
        System.out.println(stack.getCount());
    }
}
