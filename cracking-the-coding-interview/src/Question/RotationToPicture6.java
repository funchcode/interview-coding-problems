package Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 코딩 인터뷰 완벽 분석 *************
// 이미지를 표현하는 N X N 행렬이 있다.
// 이미지의 각 픽셀은 4바이트로 표현된다.
// 이미지를 90도로 회전시키는 메서드를 작성하라.
public class RotationToPicture6 {

    // 4바이트로 표현을 > int 자료형을 사용하는 걸로 이해하고 문제해결.
    public void rotation(String str) {
        List<String[]> lines = getLength(str);
        String buffer = "";
        System.out.println(lines.size());
        for(int i = 0 ; i < lines.size() ; i++){
            for(int j = lines.size()-1 ; j >= 0 ; j--) {
                buffer = buffer + lines.get(j)[i];
            }
        }
        System.out.println(buffer);
    }

    private List getLength(String str) {
        int length = (int)Math.sqrt(str.length()); // N X N이 아닐경우 예외처리.
        List<String[]> list = new ArrayList<>();
        String[] buffer = new String[length];
        for(int i=0;i<str.length();i++) {
            buffer[i % length] = String.valueOf(str.charAt(i));
            if(i % length == 4) {
                System.out.println(Arrays.toString(buffer));
                list.add(buffer);
                buffer = new String[length];
            }
        }
        return list;
    }

    public static void main(String[] args) {
        RotationToPicture6 rotationToPicture = new RotationToPicture6();
        String input = "1111122222333334444455555";
        String input2 = "1234512345123451234512345";
        rotationToPicture.rotation(input);
        rotationToPicture.rotation(input2);
    }
}



/*
* 11111
* 22222
* 33333
* 44444
* 55555
* */

/*
* 54321
* 54321
* 54321
* 54321
* 54321
* */

/*
* 55555
* 44444
* 33333
* 22222
* 11111
* */
