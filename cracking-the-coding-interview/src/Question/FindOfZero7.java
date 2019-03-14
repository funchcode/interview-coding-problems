package Question;
// 코딩 인터뷰 완벽 분석 *************
// M X N 행렬을 순회하면서 0인 원소를 발견하면, 해당 원소가 속한 행과 열의 모든 원소를 0으로 설정하는 알고리즘을 작성하라.
public class FindOfZero7 {

    // param : 들어오는 행렬을 '\n'으로 라인 구분한다.
    public void findAndPutZero(String line) {
        String[] lines = line.split("\n");
        boolean[] horizontal = new boolean[lines.length];
        boolean[] vertical = new boolean[lines[0].toCharArray().length];
        String customLine;
        for(int i = 0 ; i < lines.length ; i ++) {
            for(int j = 0 ; j < lines[0].toCharArray().length ; j++) {
                if(lines[i].charAt(j) == '0') {
                    horizontal[i] = true;
                    vertical[j] = true;
                }
            }
        }

        for(int i = 0 ; i < lines.length ; i++) {
            if(horizontal[i]) {
                lines[i] = lines[i].replaceAll(".","0");
                continue;
            }
            customLine = "";
            for(int j = 0 ; j < lines[0].toCharArray().length ; j++) {
                if(vertical[j]) {
                    customLine = customLine + "0";
                    continue;
                }
                customLine = customLine + lines[i].charAt(j);
            }
            lines[i] = customLine;
        }

    }

    public static void main(String[] args) {
        FindOfZero7 findOfZero = new FindOfZero7();
        String input = "345\n186\n748\n103";
        findOfZero.findAndPutZero(input);
    }
}


/*
* 새로 데이터 boolean
* 가로 데이터 boolean
* for 행 {
    * for 열 {
    *   열 데이터 boolean
    *   if 데이터 == 0 {
    *       if 새로 데이터 == false {
    *           새로 데이터 true
    *           가로 데이터 true
    *       }
    *   }
* }
* }
*
* 행과 열을 한번 순회하면서 데이터가 0을 추출한다.
*
* */