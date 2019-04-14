package Level3;

import java.util.*;

// 문제 설명
// : 광고성 댓글을 삭제하는 문제이다.
// : 광고글은 규칙성을 가지고 있다.
// : (규칙1)특정 단어 사이에 같은 기호를 넣는다 > HELLO HaEaLaLaO
// : (규칙2)특정 단어 앞 뒤에 같은 기호를 넣는다 > WORLD bWORLDb
// : 특정단어에 같은 규칙을 중복으로 넣을 수는 없지만, 규칙1과 규칙2를 같이 적용할 수 있다.
// : 한번 쓰인 기호(소문자)는 다시 사용할 수 없다.

// 제한 사항
// : 규칙에 따른 변환으로 만들 수 없는 문자열이 입력된 경우에는 소문자로 invaild를 리턴한다.

// 입출력 예
// 1 input : m = 6    n = 4       picture = [[1, 1, 1, 0], [1, 2, 2, 0], [1, 0, 0, 1], [0, 0, 0, 1], [0, 0, 0, 3], [0, 0, 0, 3]]
// 1 output : [4, 5]
public class KakaoAd {
    public String solution(String sentence) {
        try {
            ArrayDeque<Character> res = new ArrayDeque<Character>();
            int[] arr = new int[26];
            String answer = "";

            for (int i = 0; i < sentence.length(); i++) {
                res.add(sentence.charAt(i));
                if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
                    arr[sentence.charAt(i) - 'a']++;
                }
            }

            while (!res.isEmpty()) {
                char first = res.poll();
                ArrayDeque<Character> word = new ArrayDeque<>();

                if (first >= 'a' && first <= 'z') {
                    if (arr[first - 'a'] != 2) return "invalid";
                    if (res.peek() >= 'a' && res.peek() <= 'z') return "invalid";
                    word.add(res.poll());
                    char third = res.poll();
                    if (third >= 'a' && third <= 'z' && third != first) {
                        for (int i = 1; i < arr[third - 'a']; i++) {
                            if (res.peek() >= 'a' && res.peek() <= 'z') return "invalid";
                            word.add(res.poll());
                            if (res.poll() != third) return "invalid";
                        }
                        if (res.peek() >= 'a' && res.peek() <= 'z') return "invalid";
                        word.add(res.poll());
                        if (res.poll() != first) return "invalid";
                    } else if (third != first) {
                        word.add(third);
                        while (res.peek() != first) {
                            if (res.peek() >= 'a' && res.peek() <= 'z') return "invalid";
                            word.add(res.poll());
                        }
                        res.poll();
                    }
                } else {
                    word.add(first);
                    if(res.isEmpty()) {
                        return answer + word.poll();
                    }
                    char second = res.poll();
                    if (second >= 'a' && second <= 'z') {
                        if(arr[second - 'a'] == 2) {
                            res.addFirst(second);
                        } else {
                            for (int i = 1; i < arr[second - 'a']; i++) {
                                if (res.peek() >= 'a' && res.peek() <= 'z') return "invalid";
                                word.add(res.poll());
                                if (res.poll() != second) return "invalid";
                            }
                            if (res.peek() >= 'a' && res.peek() <= 'z') return "invalid";
                            word.add(res.poll());
                        }
                    } else {
                        word.add(second);
                        if(res.isEmpty()) {
                            return answer + word.poll() + word.poll();
                        }
                        while (res.peek() >= 'A' && res.peek() <= 'Z') {
                            word.add(res.poll());
                            if(res.isEmpty())
                                break;
                        }
                        if(!res.isEmpty()) {
                            if (arr[res.peek() - 'a'] != 2) {
                                res.addFirst(word.pollLast());
                            }
                        }
                    }
                }
                while (!word.isEmpty()) {
                    answer += word.poll();
                }
                if (!res.isEmpty())
                    answer += " ";
            }
            return answer;
        } catch(Exception e) {
            return "invalid";
        }
    }
}
