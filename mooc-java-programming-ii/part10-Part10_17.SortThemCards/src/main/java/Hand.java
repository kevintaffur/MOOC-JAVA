import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream().forEach(card -> System.out.println(card));
    }

    public void sort() {
        this.hand.stream().sorted().forEach(card -> System.out.println(card));
    }

    public List<Card> getHand() {
        return this.hand;
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new SortBySuit());
    }

    @Override
    public int compareTo(Hand hand) {
        int hand1 = this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (prev, actual) -> prev + actual);
        int hand2 = hand.getHand().stream()
                .map(card -> card.getValue())
                .reduce(0, (prev, actual) -> prev + actual);
        return hand1 - hand2;       
    }
}
