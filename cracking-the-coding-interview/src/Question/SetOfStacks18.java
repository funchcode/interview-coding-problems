package Question;

import java.util.ArrayList;
import java.util.List;

// 코딩 인터뷰 완벽 분석 *************
// 스택의 지정된 용량을 초과시에 여러 스택으로 구성되어야 한다.
// pop, push는 스택이 하나인 경우와 동일하게 동작해야 한다.
public class SetOfStacks18 {
    private List<String[]> stacks;
    private String[] stack; // ArrayList로 하고 용량을 설장해야한다.
    private int endPoint;
    private int size;

    public SetOfStacks18(int size) {
        this.stacks = new ArrayList<>();
        this.size = size;
        this.stack = new String[size];
        this.stacks.add(stack);
        this.endPoint = 0;
    }

    public void over() {
        this.stacks.add(new String[this.size]);
        this.endPoint = this.endPoint + 1;
    }

    public void under() {
        if(endPoint == 0) {
            System.out.println("현재 스택이 비어있습니다.");
            return ;
        }
        this.stacks.remove(endPoint);
        this.endPoint = this.endPoint - 1;
    }

    public void pop() {
        String[] target = this.stacks.get(endPoint);
        if(target.length == 0) {
            under();
            target = this.stacks.get(endPoint);
        }
        /*targe[target.length-1]*/
    }

    public void push(String data) {
        String[] target = this.stacks.get(endPoint);
        if(target.length == size) {
            over();
            target = this.stacks.get(endPoint);
        }
        target[target.length] = data;
    }

    public static void main(String[] args) {
        SetOfStacks18 setOfStacks = new SetOfStacks18(3);
        List<String> str = new ArrayList<>(5);
        str.add("1");
        System.out.println(str.size());
    }
}
