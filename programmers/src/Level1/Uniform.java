package Level1;

import java.util.Arrays;
// 문제 설명
// : 점심시간에 도둑이 들어 일부 학생이 체육복을 도난당했다.
// : 여벌이 있는 학생이 이들에게 체육복을 빌려주려고 한다.
// : 학생들의 번호는 체격순으로 매겨져있다. 바로 앞번호의 학생이나 바로 뒷번호의 학생에게 빌려줄 수 있다.
// : 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 한다.
// : 체육수업을 들을 수 있는 학생의 최대값을 return 하도록 작성하라.

// 제한 사항
// : 전체학생의 수는 2이상 30명이하이다.
// : 도난당한 학생의 수는 1명이상 n명 이하인데 중복되는 번호는 없다.
// : 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있다.
// : 여벌 체육복이 있는 학생이 도난 당할 수 있다. 이 학생은 다른 학생에게 체육복을 빌려줄 수 없다.

// 입출력 예
// 1 input : 전체학생 수 n = 5   도난당한 학생들의 번호 lost = [2,4]   여벌의 체육복을 가져온 학생 reserve = [1,3,5]
// 1 output : return = 5
// 2 input : 전체학생 수 n = 5   도난당한 학생들의 번호 lost = [2,4]   여벌의 체육복을 가져온 학생 reserve = [3]
// 2 output : return = 4
// 3 input : 전체학생 수 n = 3   도난당한 학생들의 번호 lost = [3]   여벌의 체육복을 가져온 학생 reserve = [1]
// 3 output : return = 2
public class Uniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        int[] temp;
        int[] students = new int[n];
        Arrays.fill(student, 1);
        for(int i = 0 ; i < lost.length ; i ++) {
            student[lost[i]-1] = 0;
        }
        for(int j = 0 ; j < reserve.length ; j ++) {
            student[reserve[j]-1] += 1;
        }
        System.arraycopy(student, 0 , students, 0, student.length);

        int[] result = new int[2];

        for(int i = 0 ; i < students.length ; i++) {
            if(students[i] == 0) {
                if(i != 0 && students[i-1] == 2) {
                    students[i] = 1;
                    students[i-1] -= 1;
                }else if(i != students.length-1 && students[i+1] == 2) {
                    students[i] = 1;
                    students[i+1] -= 1;
                }
            }
        }

        temp = Arrays.stream(students).filter(count -> count!=0).toArray();
        result[0] = temp.length;

        System.arraycopy(student, 0 , students, 0, student.length);

        for(int i = 0 ; i < students.length ; i++) {
            if(students[i] == 0) {
                if(i != students.length-1 && students[i+1] == 2) {
                    students[i] = 1;
                    students[i+1] -= 1;
                }
                else if(i != 0 && students[i-1] == 2) {
                    students[i] = 1;
                    students[i-1] -= 1;
                }
            }
        }

        temp = Arrays.stream(students).filter(count -> count!=0).toArray();
        result[1] = temp.length;

        return result[0] > result[1] ? result[0] : result[1];
    }
}
