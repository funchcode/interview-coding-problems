package Question;

import sun.plugin.cache.OldCacheEntry;

// 코딩 인터뷰 완벽 분석 *************
// 문자열에 포함된 문자열이 전부 유일한지를 검사하는 알고리즘을 구현하라.
// 다른 자료구조를 사용할 수 없는 상황이라면 어떻게 하겠는가 ?
public class OnlyString1 {

    // ASCII 코드 00 ~ 255 까지 존재
    public boolean isUnique(String str) {
        boolean[] box = new boolean[256];
        for(char element : str.toCharArray()) {
            if(box[(int)element]){
                return false;
            }
            box[(int)element] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String input_Only = "WeCanDoIt";
        String input = "we can do it";

        OnlyString1 onlyString = new OnlyString1();
        // 중복없는 데이터
        System.out.println(onlyString.isUnique(input_Only));
        // 중복 데이터
        System.out.println(onlyString.isUnique(input));
    }
}
