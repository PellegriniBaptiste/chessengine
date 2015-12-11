package board;

public class InvalidBoardException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7184516714264542859L;
	private String message;
	
	public InvalidBoardException(String message) {
		this.message=message;
	}
	
	
	public String getMessage(){
		return message;
	}

}
