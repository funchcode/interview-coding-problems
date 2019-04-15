package Level5;

// 문제 설명
// : 네오가 프로도가 비상금을 숨겨놓는 장소가 적힌 비밀지도를 얻게 되었다.
// : 지도는 정사각형의 빈공간과 벽만이 존재한다.
// : 두 개의 지도를 조합하여 최종적으로 비밀지도가 된다.
// : 들어오는 두 개의 지도는 정수배열로 들어오고 2진수로 암호를 해독해야한다.
// : 두 지도는 길이가 n인 정사각형이며 한쪽의 지도가 벽일경우 비밀지도도 벽이된다.

// 입출력 예
// 1 input : n = 5      arr1 = [9, 20, 28, 18, 11]      arr2 = [30, 1, 21, 17, 28]
// 1 output : answer = ["#####","# # #", "### #", "# ##", "#####"]
// 2 input : n = 6      arr1 = [46, 33, 33 ,22, 31, 50]      arr2 = [27 ,56, 19, 14, 14, 10]
// 2 output : answer = ["######", "### #", "## ##", " #### ", " #####", "### # "]
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String target;
        for(int i = 0 ; i < n ; i ++) {
            target = Integer.toBinaryString(arr1[i] | arr2[i]);
            while(target.length() < n) {
                target = "0" + target;
            }
            answer[i] = target.replace("0", " ").replace("1", "#");
        }

        return answer;
    }
}
