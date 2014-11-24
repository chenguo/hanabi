package hanabi;

import java.util.ArrayList;
import java.util.List;

/**
 * Track cards in discard pile
 *
 * @author Chen Guo
 **/
public class Discard {

  private List<Card> cards;

  public Discard() {
    cards = new ArrayList<Card>();
  }

  /**
   * Add a card to the discard pile
   **/
  public void add(Card card) {
    cards.add(card);
  }

  public void reset() {
    cards.clear();
  }

  /**
   * Return all cards in the discard pile
   **/
  public List<Card> view(){
    return cards;
  }

}
