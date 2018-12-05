package adapter;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 19:13
 * @since JKD 1.8
 */
public class PlayBallTest {

    public static void main(String[] args) {
        Player mcGrady = new Guard("麦迪");
        mcGrady.attack();
        Player battier = new Forward("巴蒂尔");
        battier.defense();

        ForeignPlayer ming = new ForeignPlayer("姚明");
        Translator translator = new Translator(ming);
        translator.attack();
        translator.defense();
    }
}
