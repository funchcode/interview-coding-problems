package Level2;
import java.util.Arrays;

// 문제 설명
// : 구명보트는 작아서 한 번에 최대 2명밖에 못타고 무게제한이 있다.
// : 구명보트를 최대한 적게 사용해서 모든 사람을 구출해라.
// : 사람들의 몸무게 배열 = people   구명보트의 무게제한 = limit

// 제한 사항
// : 무인도에 갇힌 사람은 1명 이상 50,000이하이다.
// : 각 사람의 몸무게는 40kg이상 limit이하이다.
// : 구명보트의 무게제한은 40이상 240이하이다.

// 입출력 예
// 1 input : people = [70,50,80,50]    limit = 100
// 1 output : 3
public class Lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int idx = 0;
        for(int end = people.length - 1 ; end >= idx ; end --) {
            answer ++;
            if(people[idx] + people[end] > limit) {
                continue;
            }
            idx++;
        }
        return answer;
    }
}


/*
Arrays.sort(people);
        List peoples = Arrays.asList(people);
        int idx;
        int weight = 0;
        while(peoples.size() >= 0) {
            idx = peoples.size() - 1;
            for(int i = idx ; i >= 0 ; i--) {
                if(weight > limit) {
                    continue;
                }
                weight += (int)peoples.get(i);
                peoples.remove(i);
            }
            answer ++;
        }
*/