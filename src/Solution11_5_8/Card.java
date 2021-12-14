package Solution11_5_8;

import java.util.Objects;

public class Card {
    private final String suit;
    private final String rang;

    public Card(String rang, String suit) {
        if(suit == null || rang == null) {
            throw new IllegalArgumentException();
        }
        this.suit = suit;
        this.rang = rang;
    }

    public String getSuit() {
        return suit;
    }

    public String getRang() {
        return rang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit.equals(card.suit) && rang.equals(card.rang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rang);
    }
}
