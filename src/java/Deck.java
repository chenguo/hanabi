package hanabi;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import hanabi.Constants.Suit;

/**
 * Hanabi card deck.
 *
 * @author Chen Guo
 **/
public class Deck {

  private final List<Card> cards;
  private final int SUIT_SIZE = 10;
  private final int[] SUIT_NUMBERS = {1, 1, 1, 2, 2, 3, 3, 4, 4, 5};
  private final List<Suit> suits;
  private final int deckSize;
  private ListIterator<Card> it;

  /**
   * Initialize deck of cards and drawing mechanism
   **/
  public Deck(boolean wildcard) {
    suits = initSuits(wildcard);
    deckSize = suits.size() * SUIT_SIZE;
    cards = initCards();
    initIterator();
  }

  /**
   * Shuffles the deck of cards into random order.
   * Resets the deck iterator.
   **/
  public Deck shuffle() {
    Random rng = new Random();
    int i = cards.size();
    while (i > 1) {
      int j = rng.nextInt(i);
      i--;
      swapCards(i, j);
    }
    initIterator();
    return this;
  }

  /**
   * Draw a card from deck. Unless the deck is shuffled,
   * this card is considered removed from the deck.
   **/
  public Card draw() {
    return it.next();
  }

  /**
   * Count undrawn cards in deck
   **/
  public int size() {
    return it.hasNext()? cards.size() - it.nextIndex() : 0;
  }

  private List<Suit> initSuits(boolean wildcard) {
    List<Suit> suits = new ArrayList<Suit>();
    suits.add(Suit.RED);
    suits.add(Suit.BLUE);
    suits.add(Suit.GREEN);
    suits.add(Suit.YELLOW);
    suits.add(Suit.WHITE);
    if (wildcard) suits.add(Suit.RAINBOW);
    return suits;
  }

  private List<Card> initCards() {
    List<Card> cards = new ArrayList<Card>(deckSize);
    for (Suit suit : suits) {
      cards.addAll(suitCards(suit));
    }
    return cards;
  }

  private List<Card> suitCards(Suit suit) {
    List<Card> suitCards = new ArrayList<Card>(SUIT_SIZE);
    for (int number : SUIT_NUMBERS) {
      suitCards.add(new Card(suit, number));
    }
    return suitCards;
  }

  private void initIterator() {
    it = cards.listIterator();
  }

  private void swapCards(int i, int j) {
    Card c = cards.get(i);
    cards.set(i, cards.get(j));
    cards.set(j, c);
  }
}
