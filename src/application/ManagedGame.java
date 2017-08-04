package application;

public class ManagedGame implements ManagedGameInt {
	private GameInfo info;
	
	//TODO constructor
	
	@Override
	public GameState getCurrentState() {
		return info.currentState;
	}
	@Override
	public GameInfo getGameInformation() {
		return info;
	}

	@Override
	public void advanceState() {
		// TODO Generate the gameplay mechanics

	}


}
