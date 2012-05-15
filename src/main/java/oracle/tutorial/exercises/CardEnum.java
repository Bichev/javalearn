package oracle.tutorial.exercises;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 15.05.12
 * Time: 23:06
 * To change this template use File | Settings | File Templates.
 */
public class CardEnum {

    private final Rank rank;
    private final Suit suit;
    
    public enum Rank {
        DIAMONDS, CLUBS, HEARTS, SPADES    
    }

    public CardEnum (Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString () {
        return rank + " of " + suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
