package Level5;
import java.util.*;

// 문제 설명
// : 특정 텍스트 검색 시에 추출되는 기사를 분류별로 보고싶음.
// : 주어진 텍스트의 자카드 유사도를 구하라. str1, str2
// : 들어오는 텍스트를 두 원소씩 묶는다 (대소문자만 포함할 수 있다.)
// : str1집합 교집합 str2집합 / str1집합 합집합 str2집합
// : 교집합 시 중복되는 원소는 적은 수
// : 합집합 시 중복되는 원소는 큰 수
// : 공집합 / 공집합은 1로 본다.
// : 유사도 * 65536을 곱하고 소수점은 버린다.

// 입출력 예
// 1 input : str1 = FRANCE        str2 = french
// 1 output : answer = 16384
// 2 input : str1 = aa1+aa2	        str2 = AAAA12
// 2 output : answer = 43690
public class JaccardIndex {
    Map<String, Integer> map1 = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();
    public int solution(String str1, String str2) {
        int big = 0;
        int small = 0;
        String key;
        setMap(map1, str1);
        setMap(map2, str2);
        Set<String> keys1 = map1.keySet();
        Set<String> keys2 = map2.keySet();

        while (!keys2.isEmpty()) {
            if (keys1.iterator().hasNext()) {
                key = keys1.iterator().next();
                if(map2.containsKey(key)) {
                    big += (map1.get(key) < map2.get(key))?map2.get(key):map1.get(key);
                    small += (map1.get(key) < map2.get(key))?map1.get(key):map2.get(key);
                    keys2.remove(key);
                    keys1.remove(key);
                }else {
                    big += map1.get(key);
                    keys1.remove(key);
                }
            }else if(keys2.iterator().hasNext()){
                key = keys2.iterator().next();
                big += map2.get(key);
                keys2.remove(key);
            }
        }

        if(small == 0 && big == 0) {
            return 65536;
        }

        return (int)Math.floor((double)small / big * 65536);
    }

    private void setMap(Map<String, Integer> map, String str) {
        char[] elements = str.toCharArray();
        String temp;
        int idx = 0;
        for(int i = 0 ; i < elements.length ; i++) {
            if(!(((int)elements[i] >= 97 && (int)elements[i] <= 122) || ((int)elements[i] >= 65 && (int)elements[i] <= 90))) {
                idx = i + 1;
            }
            if(i-idx == 1) {
                temp = str.substring(idx, i+1).toUpperCase();
                if(map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                }else {
                    map.put(temp, 1);
                }
                idx = i;
            }
        }
    }
}

/*
    private int getSmall(Map<String, Integer> map, Map<String, Integer> target, Set<String> key) {
        int result = 0;
        String keys;
        if(key.iterator().hasNext()){
            keys = key.iterator().next();
            if(map.get(keys) >= 1) {
                result += (target.get(keys)<map.get(keys)?target.get(keys):map.get(keys));
            }
        }
        return result;
    }

    private int getBig() {

        return 0;
    }

*/