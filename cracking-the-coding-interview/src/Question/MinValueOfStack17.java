package Question;

import java.util.ArrayList;
import java.util.List;

// 코딩 인터뷰 완벽 분석 *************
// push와 pop의 두 가지 연산뿐만 아니라, 최솟값을 반환하는 min 연산을 갖춘 스택은 어떻게 구현할 수 있겠는가 ?
// push, pop, min은 O(1)시간에 처리되어야 한다.
public class MinValueOfStack17 {
    private List<Integer> stack;
    private List<Integer> values;
    private int minValue;

    public MinValueOfStack17() {
        this.stack = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void push(int data) {
        this.stack.add(data);
        this.values.add(data);
        if(this.stack.size() == 1) {
            this.minValue = data;
        }
        if(minValue > data) {
            this.minValue = data;
        }
    }

    public void pop() {
        int size = this.stack.size();
        if(size <= 0) {
            System.out.println("스택이 비었습니다.");
            return;
        }
        this.values.remove(size-1);
        if(this.stack.get(size-1)==this.minValue) {
            this.minValue = getMinValue();
        }
        this.stack.remove(size-1);
    }

    public int min() {
        return this.minValue;
    }

    private int getMinValue() {
        int temp = this.values.get(0);
        for(int i = 1 ; i < this.values.size() ; i++) {
            if(this.values.get(i) < temp) {
                temp = this.values.get(i);
            }
        }
        return temp;
    }

    private String getData() {
        return this.stack.toString();
    }

    public static void main(String[] args) {
        MinValueOfStack17 minValueOfStack = new MinValueOfStack17();
        minValueOfStack.push(4);
        minValueOfStack.push(7);
        minValueOfStack.push(2);
        minValueOfStack.push(9);
        minValueOfStack.pop();
        minValueOfStack.pop();
        System.out.println(minValueOfStack.getData());
        System.out.println(minValueOfStack.min());
    }
}
