package oracle.tutorial.exercises;


/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 14.05.12
 * Time: 22:42
 * To change this template use File | Settings | File Templates.
 */
public class DisplayDeck {
    public static void main (String... args){
//        Deck deck = new Deck();
//
//        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++){
//            for (int rank = Card.ACE; rank <= Card.KING; rank ++) {
//                Card card = deck.getCard(suit, rank);
//                System.out.format("%s of %s%n",
//                        card.rankToString(card.getRank()),
//                        card.suitToString(card.getSuit()));
//            }
//        }

        DeckEnum deckEnum = new DeckEnum();

        for (CardEnum card : deckEnum.getCards() ) {
            System.out.println(card.toString());
        }
    }
}
