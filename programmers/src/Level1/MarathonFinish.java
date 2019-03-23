package Level1;

// 문제 설명
// : 단 한명의 선수만 제외하고 모두 마라톤을 완주하였다.
// : 마라톤에 참여한 선수들의 이름이 담긴 배열 "participant"와 완주한 선수들의 이름이 담긴 "completion"이 주어질 때,
// : 완주하지 못한 선수의 이름을 return해라.

// 제한 사항
// : 경기에 참여한 선수의 수는 1이상 100,000이하이다.
// : "completion"의 길이는 "participant"보다 1작다.
// : 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어짐.
// : 참가자 중에는 동명이인이 있을 수 있다.

import java.util.Arrays;

// 입출력 예
// 1 input : participant ["leo","kiki","eden"], completion ["eden","kiki"]
// 1 output : "leo"
// 2 input : participant ["mislav", "stanko", "mislav", "ana"], completion ["stanko", "ana", "mislav"]
// 2 output : "mislav"
public class MarathonFinish {
    public String solution(String[] participant, String[] completion) {
        if(participant.length-1 != completion.length) {
            // 예외처리
        }
        Arrays.sort(participant);
        Arrays.sort(completion);
        String people = "";
        String finish;
        boolean last = true;
        for (int i = 0; i < completion.length ; i++) {
            people = participant[i];
            finish = completion[i];
            if (!people.equals(finish)) {
                last = false;
                break;
            }
        }
        if(last) {
            people = participant[participant.length-1];
        }

        System.out.println(people);

        return "";
    }
}
