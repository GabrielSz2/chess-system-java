package boardgame;

public class BoardException extends RuntimeException{

	private static final long serialversionUID = 1L;
	
	public BoardException(String msg) {
		super(msg);
	}
}
