package oracle.tutorial.exercises;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 14.05.12
 * Time: 21:55
 * To change this template use File | Settings | File Templates.
 */
public class Deck {
    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCars = numRanks * numSuits;
    
    private Card[][] cards;

    public Deck(){
        cards = new Card[numSuits][numRanks];
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++ ) {
            for (int rank = Card.ACE; rank <= Card.KING; rank ++) {
                cards[suit-1][rank-1] = new Card(rank,suit);
            }
        }
    }

    public Card getCard (int suit, int rank) {
        return cards[suit-1][rank-1];
    }

    public Card[][] getCards() {
        return cards;
    }
}
