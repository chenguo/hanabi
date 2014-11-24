package hanabi;

/**
 * Manipulates game, including initialization, managing moves, and scoring
 * the result.
 *
 * @author Chen Guo
 **/
public class Game {

  private final Deck deck;
  private Discard discard;
  private final int MAX_CLOCKS = 8;
  private final int INIT_FUSES = 3;
  private int clocks;
  private int fuses;

  /**
   * Initialize game state.
   **/
  public Game() {
    deck = initDeck();
    discard = initDiscard();
    initCounters();
  }

  private Deck initDeck() {
    // For now, always leave out wildcard
    return new Deck(false);
  }

  private Discard initDiscard() {
    return new Discard();
  }

  private void initCounters() {
    clocks = MAX_CLOCKS;
    fuses = INIT_FUSES;
  }

}
