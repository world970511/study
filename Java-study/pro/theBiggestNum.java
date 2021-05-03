import java.util.*;
//프로그래머스_가장 큰 수
/*0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
<제한 사항>
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다*/

public class theBiggestNum2 {
private static String solution(int[] num) {
        // TODO Auto-generated method stub
        String [] str=new String[num.length];//배열을 문자열 배열로 변경
        for(int i=0;i<num.length;i++) {
            str[i]=String.valueOf(num[i]);
        }
        
        Arrays.sort(str, new Comparator<String>() {//역순으로 사전 정렬(앞의 문자가 큰 순서대로 정렬)
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        String ans="";
        
        for(int i=0;i<str.length;i++) {//입력이 0,0,0 같이 들어왔을 경우 무조건 0 만 출력
            if(str[0].equals("0")) {
                ans+=str[i];
                return ans;
            }
            else {
                ans+=str[i];
            }
        }
        return ans;
    }
}
