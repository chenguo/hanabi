package hanabi;

import hanabi.Constants.Suit;

/**
 * Single Hanabi card.
 *
 * @author Chen Guo
 **/
public class Card {

  private final Suit suit;
  private final int number;

  /**
   * Create a card with an assigned suit and number
   **/
  public Card(Suit suit, int number) {
    this.suit = suit;
    this.number = number;
  }

  public Suit getSuit() {
    return suit;
  }

  public int getNumber() {
    return number;
  }
}
