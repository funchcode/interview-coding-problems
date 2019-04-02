package Level2;

// 문제 설명
// : 조이스틱으로 알파벳 이름을 완성해라.
// : 맨 처음에는 A로만 이루어져있다.
// : ▲ = 다음 알파벳, ▼ = 이전 알파벳(A에서 이동하면 Z로), ◀ = 커서를 왼쪽으로(커서가 맨앞에서 왼쪽이면 맨 뒤로),︎ ▶ = 커서를 오른쪽으로 이동

// 제한 사항
// : ︎name은 알파벳 대문자로 이루어져 있다.
// : name의 길이는 1이상 20 이하이다.

// 입출력 예
// 1 input : name = "JEROEN"
// 1 output : 56
// 2 input : name = "JAN"
// 2 output : 23
public class JoyStick {
    public int solution(String name) {
        int answer = 0;
        int num;
        int cnt = name.length() - 1;
        int cnt2 = name.length() - 1;
        for(char e : name.toCharArray()) {
            num = e - 65;
            answer += (num <= 13)?num:Math.abs(num-26);
            System.out.println("+ " + answer);
        }
        for(int i = name.length() - 1 ; i > 0 ; i--) {
            if(name.charAt(i) == 65) {
                --cnt;
            }else {
                break;
            }
        }

        for(int i = 1 ; i < name.length() ; i++) {
            if(name.charAt(i) == 65) {
                --cnt2;
            }else if(i != 0 && name.charAt(i) != 65) {
                System.out.println("-----");
                break;
            }
        }
        System.out.println(cnt + ":" + cnt2);
        if(cnt > cnt2) {
            answer += cnt2;
        }else {
            answer += cnt;
        }

        return answer;
    }
}
