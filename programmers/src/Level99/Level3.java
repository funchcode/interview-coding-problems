package Level99;

public class Level3 {
    public static long findRange(int num) {
        char max = 0, min = 0;
        boolean isNotOne = false;
        char[] data = String.valueOf(num).toCharArray();
        for(char i : data) {
            if((min!=0&&max!=0)||(max!=0&&isNotOne)) break;
            if(max==0&&i!='9') max=i;
            if(min==0&&data[0]!='1') {
                isNotOne = true;
                min = i;
            }else if(min==0&&data[0]=='1'&&i!=0&&i!='1') {
                min=i;
            }
        }
        return Long.valueOf(String.valueOf(num).replace(max, '9')) - Long.valueOf(String.valueOf(num).replace(min, isNotOne?'1':'0'));
    }
}

/* 제출했던 코드
        char[] value = String.valueOf(num).toCharArray();   // 들어온 수 조각
        char max = 0, min = 0;  // 큰 수, 작은 수 담을 변수
        boolean isZero = false; // 첫 번째 수가 1인지 여부

        for(int i = 0 ; i < value.length ; i ++) {
            if((min != 0 && max != 0) || (max != 0 && isZero)) {    // 큰 수, 작은 수를 찾았나
                break;
            }

            if(max == 0 && value[i] != '9') {   // 제일 먼저 나온 9가 아닌 수 = 최대 값
                max = value[i];
            }

            if(min == 0 && value[0] != '1') {   // 제일 먼저 나온 1이 아닌 수 = 최소 값
                isZero = true;
                min = value[i];
            }else if(min == 0 && value[0] == '1' && i != 0 && value[i] != '1') {    // 1이 아닌 수 = 최소 값
                min = value[i];
            }
        }
        String maxS = String.valueOf(num).replace(max, '9');    // 9로 변경
        String minS = String.valueOf(num).replace(min, isZero?'1':'0'); // 첫 번째 수가 1이 아니면 1로 첫번째 수가 1이면 그 다음에 나오는 숫자를 0으로


        return Long.valueOf(maxS) - Long.valueOf(minS);
*/
