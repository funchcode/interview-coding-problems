package Level5;

import java.util.*;

// 문제 설명
// : 카카오 오픈채팅방에 특정 사용자의 히스토리 남겨라.
// : 카카오 오픈채팅방은 닉네임으로 들어올 수 있고, 중복이 가능하다.
// : 채팅방에서 닉네임을 변경, 나갔다가 들어오면서 닉네임을 변경할 수 있다.
// : 최종 닉네임으로 히스토리를 출력하라

// 입출력 예
// 1 input : record = ["Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"]
// 1 output : answer = 	["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
public class OpenChat {
//    ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
    public String[] solution(String[] record) {
        Map<String, String> user = new HashMap<>();
        Map<String, String> status = new HashMap<>();
        status.put("Enter", "들어왔습니다.");
        status.put("Leave", "나갔습니다.");
        List<String> s = new ArrayList<>();
        String[] event;
        for(String e : record) {
            event = e.split(" ");
            if(!user.containsKey(event[1])) {
                user.put(event[1], event[2]);
            }
            if(!event[0].equals("Leave")) {
                user.put(event[1], event[2]);
            }
            if(!event[0].equals("Change")) {
                s.add(e);
            }
        }

        String[] answer = new String[s.size()];

        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = user.get(s.get(i).split(" ")[1]) + "님이 " + status.get(s.get(i).split(" ")[0]);
        }
        return answer;
    }
}

/* 베스트코드
        Map<String, String> idMap = new HashMap<>();
        // get final nick names for each id
        List<String[]> tmp = new LinkedList<>();
        for (String record: records) {
            String[] keywords = record.split(" ");
            if (keywords[0].equals("Enter")) {
                idMap.put(keywords[1], keywords[2]);
                tmp.add(keywords);
            } else if (keywords[0].equals("Change")) {
                idMap.put(keywords[1], keywords[2]);
            } else {
                // Leave
                tmp.add(keywords);
            }
        }
        // print 들어왔습니다/나갔습니다.
        String[] printList = new String[tmp.size()];
        int i = 0;
        for (String[] keywords: tmp) {
            String nickname = idMap.get(keywords[1]);
            if (keywords[0].equals("Enter")) {
                printList[i++] = nickname + "님이 들어왔습니다.";
            } else {
                printList[i++] = nickname + "님이 나갔습니다.";
            }
        }
        return printList;
*/

/* 버전 1 코드 시간초과
    public String[] solution(String[] record) {
        Map<String, String> user = new HashMap<>();
        List<History> room = new LinkedList<>();

        String[] event;
        for(String element : record) {
            event = element.split(" ");
            if(event[0].equals("Change")) {
                user.put(event[1], event[2]);
            }else {
                if(event[0].equals("Enter")) {
                    user.put(event[1], event[2]);
                }
                room.add(new History(event[1], event[0]));
            }
        }
        String[] answer = new String[room.size()];
        for (int i = 0 ; i < room.size() ; i++) {
            answer[i] = user.get(room.get(i).getId()) + "님이 " + (room.get(i).getStatus().equals("Enter")?"들어왔습니다.":"나갔습니다.");
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    class History {
        private String id;
        private String status;

        public History(String id, String status) {
            this.id = id;
            this.status = status;
        }

        public String getId() {
            return this.id;
        }
        public String getStatus() {
            return this.status;
        }
    }
*/