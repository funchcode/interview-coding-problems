import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 요구사항 : 전달하는 문자를 구분자로 분리한 후 각 숫자의 합을 구해 반환해야 한다.
// 구분자(,나 :)를 기준으로 분리한 후 숫자의 합을 반환 (" " => 0, "1,2" => 3, "1,2:3" => 6)
// 커스텀 구분자(// \n)를 사용하여 구분자를 만들 수도 있다. (//;\n 일 경우 구분자는 ;)
// 문자열에 음수를 전달받는 경우 RuntimeException으로 예외처리해야한다.
public class StringCalculator {

    // 문자열의 총 합을 반환
    public int getSumOfString(String input) {
        return getSum(hasCustomToken(input));
    }

    // 커스텀 구분자 존재여부
    public String hasCustomToken(String input) {
        // 커스텀 문자 빼내는 정규표현식
        String regex = "//(.)\n(.*)";
        if(input.matches(regex)) {
            Matcher regexMatcher = Pattern.compile(regex).matcher(input);
            if(regexMatcher.find()) {
                return regexMatcher.group(2).replaceAll(regexMatcher.group(1), ",");
            }
        }
        return input;
    }

    // 구분자 분리 후 계산
    public int getSum(String input) throws RuntimeException {
        String[] number = input.replaceAll(":", ",").split(",");
        int total = 0;
        for(String target : number) {
            if(isNegativeNum(target.trim())) {
                throw new RuntimeException("음수가 존재합니다.");
            }
            total = total + Integer.parseInt(target);
        }

        return total;
    }

    // 음수 존재여부
    public boolean isNegativeNum(String input) {
        String regex = "-.*";
        return input.matches(regex);
    }

}
