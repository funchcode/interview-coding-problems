package Level1;

// 문제 설명
// : 2016년 1월 1일은 금요일이다. 2016년 a월 b일은 무슨 요일일까 ?
// : 요일은 SUN,MON,TUE,WED,THU,FRI,SAT의 값으로 리턴하라.

// 제한 사항
// : 2016년은 윤년이다.
// : 2016년 a월 b일은 실제로 있는 날이다.

// 입출력 예
// 1 input : a = 5   b = 24
// 1 output : "TUE"
public class LeapYear {
    public String solution(int a, int b) {
        int[] calendar = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        String[] days = new String[]{"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int temp = 0;
        if(a != 1) {
            for(int i = 0 ; i < a - 1 ; i ++) {
                temp += calendar[i];
            }
        }
        return days[(temp + b) % 7];
    }
}
