package Level5;

import java.util.*;

// 문제 설명
// : 무지 먹방 TV
// : 음식 배열이 있고 음식은 1초동안 섭취할 수 있다.
// : 회전판에 있는 음식들은 순서대로 무지의 앞에 놓인다.
// : 회전판이 무지 앞에 놓이는 시간은 없다고 가정한다.

// 제한 사항
// : k는 방송이 종료된 시간이다. 더 이상 섭취할 음식이 없다면 -1을 반환한다.
// : 1<= food_times.length <= 2,000
// : 1<= k <= 2,000,000

// 입출력 예
// 1 input : food_times = [3,1,2]       k = 5
// 1 output :  result = 1
public class KakaoTV {
    class Food {
        int time;
        int idx;
        Food(int t, int i) {
            time = t;
            idx = i;
        }
    }

    Comparator<Food> CompTime = new Comparator<Food>() {

        @Override
        public int compare(Food a, Food b) {
            return a.time - b.time;
        }
    };

    Comparator<Food> CompIdx = new Comparator<Food>() {

        @Override
        public int compare(Food a, Food b) {
            return a.idx - b.idx;
        }
    };

    public int solution(int[] food_times, long k) {
        int answer = 0;

        List<Food> foods = new LinkedList<Food>();
        int n = food_times.length;

        for(int i = 0 ; i < n ; i++) {
            foods.add(new Food(food_times[i], i+1));
        }

        foods.sort(CompTime);

        int i = 0;
        int pretime = 0;
        for(Food f : foods) {
            long diff = f.time - pretime;

            if(diff != 0) {
                long spend = diff * n;
                if(spend <= k) {
                    k -= spend;
                    pretime = f.time;
                } else {
                    k %= n;
                    foods.subList(i, food_times.length).sort(CompIdx);
                    return foods.get(i + (int)k).idx;
                }
            }
            i ++;
            n --;
        }

        return -1;
    }
}
