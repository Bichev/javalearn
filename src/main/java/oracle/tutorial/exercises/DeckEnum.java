package oracle.tutorial.exercises;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 15.05.12
 * Time: 23:15
 * To change this template use File | Settings | File Templates.
 */
public class DeckEnum {

    private CardEnum[] cards = new CardEnum[52];

    public DeckEnum(){
        int i =0;
        for (Suit suit : Suit.values()) {
            for (CardEnum.Rank rank : CardEnum.Rank.values()) {
                cards[i++] = new CardEnum(rank, suit);
            }
        }
    }

    public CardEnum[] getCards () {
        return cards;
    }
}
