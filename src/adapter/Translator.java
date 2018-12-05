package adapter;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 19:00
 * @since JKD 1.8
 */
public class Translator {

    private ForeignPlayer player;

    public Translator(ForeignPlayer player) {
        this.player = player;
    }

    public void attack() {
        player.jingong();
    }

    public void defense() {
        player.fangshou();
    }
}
