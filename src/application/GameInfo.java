package application;

import java.util.List;

public class GameInfo {
	public GameState currentState;
	public int currentTurn;
	public List<Hand> playerHands;
	public List<Card> currentHand;
	public List<Hand> previousHands;
	public int numTricksPlayed;
	public List<Integer> teamScores;
}
