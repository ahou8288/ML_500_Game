package application;

public interface ManagedGameInt {
	public GameState getCurrentState();
	public void advanceState();
	public GameInfo getGameInformation();
}
