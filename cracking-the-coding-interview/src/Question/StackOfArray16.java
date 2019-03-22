package Question;

import java.util.Stack;

// 코딩 인터뷰 완벽 분석 *************
// 하나의 배열을 사용해 세 개의 스택을 구현하는 방법을 설명하라.
public class StackOfArray16 {
// 내 생각 : 배열의 Index로 스택을 가상으로 구분지어 사용하면 될 것 같다.
// Stack1 = index1, Stack2 = index2, Stack3 = index3
    private String[] buffer;
    private Integer lastIndex1;
    private Integer lastIndex2;
    private Integer lastIndex3;

    public StackOfArray16(Integer size) {
        this.buffer = new String[size];
        this.lastIndex1 = 1;
        this.lastIndex2 = 2;
        this.lastIndex3 = 3;
    }

    public String[] getData() {
        return this.buffer;
    }

    // 데이터 추가
    public void push(Integer target, String data) {
        Integer index = getTarget(target);
        if(this.buffer[index] == null) {
            this.buffer[getTarget(target)] = data;
        }else {
            setIndex(target,+3);
            this.buffer[getTarget(target)] = data;
        }
    }

    // 데이터 삭제
    public void pop(Integer target) {
        Integer index = getTarget(target);
        if(index <= 0) {
            setIndex(target, 0);
            this.buffer[getTarget(target)] = null;
        }else {
            this.buffer[getTarget(target)] = null;
            setIndex(target,-3);
        }
    }

    private void setIndex(Integer target, Integer oper) {
        if(target > 3 || target <= 0) {
            return;
        }
        if(target == 1) {
            this.lastIndex1 = target + oper;
        }else if(target == 2) {
            this.lastIndex2 = target + oper;
        }else {
            this.lastIndex3 = target + oper;
        }
    }

    private Integer getTarget(Integer target) {
        if(target > 3 || target <= 0) {
            return 0;
        }
        if(target % 3 == 1) {
            return this.lastIndex1;
        }else if(target % 3 == 2) {
            return this.lastIndex2;
        }else {
            return this.lastIndex3;
        }
    }

    public static void main(String[] args) {
        StackOfArray16 stackOfArray = new StackOfArray16(255);
        stackOfArray.push(1, "a");
        stackOfArray.push(1, "a");
        stackOfArray.push(1, "a");
        for(int i = 0 ; i < stackOfArray.buffer.length ; i ++) {
            System.out.println(stackOfArray.buffer[i]);
        }
    }
}
