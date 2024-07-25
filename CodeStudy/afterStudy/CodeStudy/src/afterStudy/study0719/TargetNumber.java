package afterStudy.study0719;

public class TargetNumber {

    int cur=0;
    int idx=0;
    public int solution(int[] numbers, int target) {
        int answer=0;
        backtrack(0,0,numbers,target);
        return answer;
    }


    void backtrack(int cur,int idx,int[] numbers,int target) {
        //basecase
        if(idx == numbers.length) {
            if(target == cur) {

            }
        }

        //recursive call
        backtrack(cur+numbers[idx],idx+1,numbers,target);
        backtrack(cur-numbers[idx],idx+1,numbers,target);

    }
    public static void main(String[] args) {
        TargetNumber t=new TargetNumber();
        int[] numbers=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(t.solution(numbers,9));
    }
}
