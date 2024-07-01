package afternoon.lang.math.lotto;
import java.util.Random;

public class LottoGenerator {
    public int[] lottoNumbers = new int[6];




    public void generate(){
        for(int i = 0; i<lottoNumbers.length; i++){
            lottoNumbers[i] = (int)(Math.random()*44+1);
            for(int j = 0; j < i; j++) {
                if(lottoNumbers[i] == lottoNumbers[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    public void printLottoNumbers(){
        System.out.print("로또 번호 : ");
        for(int i = 0; i<6; i++){
            System.out.print(lottoNumbers[i]+" ");
        }
    }
}
