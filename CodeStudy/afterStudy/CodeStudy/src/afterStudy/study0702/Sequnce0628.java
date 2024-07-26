package afterStudy.study0702;

public class Sequnce0628 {
    public static int[] main(int[] sequence, int k) {

//       int[]  sequence = new int[ 1, 1, 2, 3, 4, 5];

        int[] answer = {0, 1_000_000};

        int sum=0;
        int start = 0;


        for(int i=0; i<sequence.length; i++){
            int end = 0;
            sum+=sequence[i];
            if(sum==k){
                return answer = new int[]{start, end};

            }else if(sum<k){
                ++end;
                sum+=sequence[end];
            }

        }
        return answer;
    }
}
