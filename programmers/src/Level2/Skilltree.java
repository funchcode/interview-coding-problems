package Level2;

import java.util.HashMap;
import java.util.Map;
// 문제 설명
// : * 선행스킬 : 어떤 스킬을 배우기 전에 선행적으로 먼저 배워야하는 스킬을 의미한다.
// : 예를 들어 선행 스킬 순서가 [ 스파크 -> 라이트닝 볼트 -> 썬더 ] 일 때, 그 순서가 바뀔 수 없다.
// : 순서에 상관없는 스킬도 존재한다. 예를 들어 [ 힐링 등 ]
// : 매개변수로 선행스킬이 정의된 skill
// : 매개변수2로 유저들이 만든 스킬트리를 담은 배열 skill_trees를 받는다.
// : 사용가능한 스킬트리 갯수를 반환하는 함수를 구하라.

// 제한 사항
// : 스킬은 알파벳 대문자로 표기, 모든 문자열은 알파벳 대문자.
// : 선행스킬순서 skill의 길이는 2이상 26이하이며 중복되지 않는다.
// : skill_trees는 1이상 20이하인 배열
// : skill_trees는 2이상 26이인 문자열이며, 스킬의 중복 없다.

// 입출력 예
// 1 input : skill = ["CBD"]       skill_trees = ["BACDE", "CBADF", "AECB", "BD"]
// 1 output : 2
public class Skilltree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int idx;
        Map<Character, Integer> skills = new HashMap<>();
        for(int i = 0 ; i < skill.length() ; i ++) {
            skills.put(skill.charAt(i), i+1);
        }

        for(String st : skill_trees) {
            idx = 1;
            System.out.println(st);
            System.out.println("answer : " + answer);
            for(int i = 0 ; i < st.length() ; i++) {
                if(skills.containsKey(st.charAt(i))) {
                    System.out.println(st.charAt(i));
                    if (idx == skills.get(st.charAt(i))) {
                        idx += 1;
                    }else {
                        answer --;
                        break;
                    }
                }
            }
            answer ++;
        }

        return answer;
    }
}
