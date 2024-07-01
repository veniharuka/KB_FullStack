package afternoon.lang.math.lotto;
import java.util.Random;
public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        lottoGenerator.generate();
        lottoGenerator.printLottoNumbers();
    }

}
