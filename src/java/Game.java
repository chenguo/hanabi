package hanabi;

/**
 * Manipulates game, including initialization, making moves, and scoring
 * the result.
 *
 * @author Chen Guo
 **/
public class Game {

  private final Deck deck;

  /**
   * Initialize game state.
   **/
  public Game() {
    deck = initDeck();
  }

  private Deck initDeck() {
    // For now, always leave out wildcard
    return new Deck(false).shuffle();
  }

}
