package Level5;

// 문제 설명
// : 아이유 3단 고음 연습 기록이다.
// : (규칙1) 첫음 +1에서 *(x3)을 시작으로 +(+1) +(+1)이 3단 고음 한 세트이다.
// : (규칙2) 첫 3단고음 도중에 다시 3단고음을 시작하게 된다면 남은 단계를 뒤에서 적용해야한다. *+ *++ +

// 입출력 예
// 1 input : n = 15
// 1 output : answer = 1
// 2 input : n = 41
// 2 output : answer = 2
public class GoodDayIU {
    public int findNum(int num, int m, int p) {
        if(num == 1 && m == 0 && p == 0) return 1;
        if(num <= 1) return 0;
        if(m < 0 || p < 0) return 0;
        if(p > m*2) return 0;
        if(m == 0) return 0;

        if(num % 3 == 0) {
            return findNum(num / 3, m - 1, p) + findNum(num - 3, m, p - 3);
        } else {
            return findNum(num - num % 3, m, p - num % 3);
        }
    }
    public int solution(int n) {
        return findSol(n);
    }
    public int findSol(int n) {
        int m = (int) (Math.log(n) / Math.log(3));
        return findNum(n, m, 2*m);
    }
}
// **++ 11
// *+*+ 13
// *++* 15

// ***++++ 31
// **+*+++ 33
// **++*++ 35
// **+++*+ 37
// **++++* 39

// *+**+++ 39
// *+*+*++ 41
// *+*++*+ 43

// *++++** 51