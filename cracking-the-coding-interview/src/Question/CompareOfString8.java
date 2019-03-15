package Question;
// 코딩 인터뷰 완벽 분석 *************
// 한 단어가 다른 단어에 포함된 문자열인지 판별하는 isSubstring이라는 메서드가 있다고 가정한다.
// s1과 s2의 두 문자열이 주어졌을 경우, s2가 s1을 회전시킨 결과인지 판별하는 코드를 isSubstring을 한 번만 호출하도록 하여 작성.
public class CompareOfString8 {

    public boolean isSubstring(String str1, String str2) {
        boolean result = str1.matches(".*"+reverse(str2)+".*");

        if(!result) {
            result = str2.matches(".*"+reverse(str2)+".*");
        }

        return result;
    }

    private String reverse(String str) {
        String temp = "";
        for(int i = str.toCharArray().length-1 ; i >= 0 ; i--) {
            temp = temp + str.charAt(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        CompareOfString8 compareOfString = new CompareOfString8();
        System.out.println(compareOfString.isSubstring("ABCDE", "ADCBA"));
//        System.out.println("BCDDD".matches(".*BC.*"));
    }
}
