//프로그래머스_ 스킬 트리
/*예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.
위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만,
 썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.
선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때,
 가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.*/
class Solution {
    public int solution(String skill, String[] skill_trees) {
         int answer = skill_trees.length;//가능한 스킬 트리의 개수
            int beidx = 0, nidx = 0;//beidx=이전 인덱스, nidex=현재 인덱스
            
            for (int i = 0; i < skill_trees.length; i++) {
                beidx = skill_trees[i].indexOf(skill.charAt(0));
                //이전 인덱스 변수에 제일 먼저 시작하는 선수 스킬의 인덱스 값을 넣는다
                for (int i2 = 1; i2 < skill.length(); i2++) {
                    nidx = skill_trees[i].indexOf(skill.charAt(i2));
                    //현재 인덱스 변수에 스킬의i값이 든 변수의 값을 입력받는다
                    if(beidx > nidx && nidx != -1) {
                        answer--;//가능하지 않으니 -
                        break;
                    } //nidx의 값이 0이 아니고 bidx의 값이 nidx보다 클 때 브레이크 (선수 스킬이 뒤에 있을때)
                    else if  (beidx == -1 && nidx!= -1){
                        answer--;//가능하지 않으니 -
                        break;
                    } //nidx의 값이 0이 아니고 bidx의 값이 -1일때 브레이크 (선수 스킬이 없을 경우)
                    beidx = nidx;//앞의 두 경우 전부 다 아닐 때 다음 인덱스 값은 이전 인덱스로 이전
                }
            }
            return answer;
        }
    }
