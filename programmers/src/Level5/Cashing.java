package Level5;

import java.util.*;


// 문제 설명
// : 캐시 크기에 따른 실행시간 측정 프로그램을 작성하라.
// : 주어진 값은 캐시크기(정수), 도시이름 배열(대소문자) - 구분하지 않는다.
// : LRU를 이용하여 작성하라. hit 시에 +1, miss 시에 +5

// 입출력 예
// 1 input : cacheSize= 3        cities= ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"]
// 1 output : answer = 50
// 2 input : cacheSize= 3        cities= ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"]
// 2 output : answer = 25
public class Cashing {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return 5 * cities.length;
        int answer = 0;
        LinkedList<String> queue = new LinkedList<>();
        String target;

        for(String city : cities) {
            city = city.toUpperCase();
            if(queue.size() < cacheSize) {
                if(queue.contains(city)) {
                    queue.remove(queue.indexOf(city));
                    queue.push(city);
                    answer += 1;
                }else {
                    queue.push(city);
                    answer += 5;
                }
            } else {
                if(queue.contains(city)) {
                    queue.remove(queue.indexOf(city));
                    queue.push(city);
                    answer += 1;
                }else {
                    queue.remove(queue.size()-1);
                    queue.push(city);
                    answer += 5;
                }
            }
        }

        return answer;
    }
}


/*
    Map<String, Integer> weight = new HashMap<>();
        List<String> cache = new LinkedList<>();
        String e;
        int min, pop;

    for(int k = 0 ; k < cities.length ; k++) {
        // 대소문자 구분
        e = cities[k].toUpperCase();

        // 캐시에 여분이 있을 경우
        if(cache.size() < cacheSize) {
            // 캐시에 이미 존재할 경우
            if(cache.contains(e)) {
                // 가중치 추가
                // 가중치가 존재하는가
                weight.put(e, weight.get(e) + 1);
                answer += 1;
            }
            // 캐시에 없는 경우
            else {
                cache.add(e);
                weight.put(e, 0);
                answer += 5;
            }
        }
        else {
            // 캐시에 존재하는 데이터일 경우
            if(cache.contains(e)) {
                weight.put(e, weight.get(e) + 1);
                answer += 1;
            }
            // 캐시에 존재하지 않는 데이터일 경우
            else {
                min = weight.get(cache.get(0));
                pop = 0;
                if(min != 0) {
                    for(int j = 1 ; j < weight.size() ; j++) {
                        if(min > weight.get(cache.get(j))) {
                            min = weight.get(cache.get(j));
                            pop = j;
                        }
                    }
                }
                weight.remove(cache.get(pop));
                cache.remove(pop);
                cache.add(e);
                weight.put(e, 0);
                answer += 5;
            }
        }
    }
*/
